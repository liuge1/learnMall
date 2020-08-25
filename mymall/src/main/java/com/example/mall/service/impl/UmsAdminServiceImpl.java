package com.example.mall.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.example.mall.common.ResultCode;
import com.example.mall.common.utils.JwtTokenUtil;
import com.example.mall.dao.UmsAdminRoleRelationDao;
import com.example.mall.dto.UserDto;
import com.example.mall.mbg.mapper.UmsAdminMapper;
import com.example.mall.mbg.model.UmsAdmin;
import com.example.mall.mbg.model.UmsAdminExample;
import com.example.mall.mbg.model.UmsPermission;
import com.example.mall.mbg.model.UmsRole;
import com.example.mall.service.UmsAdminService;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @Classname UmsAdminServiceImpl
 * @Description TODO
 * @Date 2020/8/19 15:42
 * @Created by v_geeliu
 */
@Slf4j
@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Autowired
    private UmsAdminRoleRelationDao adminRoleRelationDao;
    @Autowired
    private HttpServletRequest request;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;

    @Value("${jwt.tokenHead}")
    private String tokenHead;


    @Override
    public UmsAdmin getAdminByUsername(String username) {
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsAdmin> umsAdmins = umsAdminMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(umsAdmins)) {
            return umsAdmins.get(0);
        }
        return null;
    }

    @Override
    public UmsAdmin register(UmsAdmin umsAdminParam) {
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminParam, umsAdmin);
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setStatus(1);
        //查询是否有相同用户名的用户
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(umsAdminParam.getUsername());
        List<UmsAdmin> umsAdminList = umsAdminMapper.selectByExample(example);
        if (umsAdminList.size() > 0) {
//            throw new BadCredentialsException("密码不正确");
            return null;
        }
        //将密码进行加密操作
        String encode = passwordEncoder.encode(umsAdminParam.getPassword());
        umsAdmin.setPassword(encode);
        umsAdminMapper.insert(umsAdmin);
        return umsAdmin;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            log.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        return adminRoleRelationDao.getPermissionList(adminId);

    }

    @Override
    public UmsAdmin getCurrentAdmin() {
//        String userStr = request.getHeader(AuthConstant.USER_TOKEN_HEADER);
        String authHeader = request.getHeader(tokenHeader);
        String authToken = authHeader.substring(tokenHead.length());
        String userName = jwtTokenUtil.getUserNameFromToken(authToken);
        UmsAdmin admin = getAdminByUsername(userName);
        //        if(StrUtil.isEmpty(userStr)){
////            Asserts.fail(ResultCode.UNAUTHORIZED);
//        }
//        UserDto userDto = JSONUtil.toBean(userStr, UserDto.class);
//        UmsAdmin admin = adminCacheService.getAdmin(userDto.getId());

//        UmsAdmin admin = null;
        if (admin != null) {
            return admin;
        } else {
//            admin = umsAdminMapper.selectByPrimaryKey(userDto.getId());
////            adminCacheService.setAdmin(admin);
//            return admin;
        }
        return null;
    }

    @Override
    public List<UmsRole> getRoleList(Long adminId) {
        return adminRoleRelationDao.getRoleList(adminId);
    }

    @Override
    public List<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        UmsAdminExample example = new UmsAdminExample();
        UmsAdminExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andUsernameLike("%" + keyword + "%");
            example.or(example.createCriteria().andNickNameLike("%" + keyword + "%"));
        }
        return umsAdminMapper.selectByExample(example);
    }
}
