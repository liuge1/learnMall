package com.example.mall.service.impl;

import cn.hutool.core.util.StrUtil;
import com.example.mall.mbg.mapper.UmsResourceMapper;
import com.example.mall.mbg.mapper.UmsRoleMapper;
import com.example.mall.mbg.mapper.UmsRoleResourceRelationMapper;
import com.example.mall.mbg.model.UmsResource;
import com.example.mall.mbg.model.UmsResourceExample;
import com.example.mall.service.UmsResourceService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Classname UmsResourceServiceImpl
 * @Description 后台资源管理Service实现类
 * @Date 2020/8/25 17:10
 * @Created by v_geeliu
 */
@Service
public class UmsResourceServiceImpl implements UmsResourceService {

    @Autowired
    private UmsResourceMapper resourceMapper;
    @Autowired
    private UmsRoleMapper roleMapper;
    @Autowired
    private UmsRoleResourceRelationMapper roleResourceRelationMapper;

    @Override
    public int create(UmsResource umsResource) {
        return 0;
    }

    @Override
    public int update(Long id, UmsResource umsResource) {
        return 0;
    }

    @Override
    public UmsResource getItem(Long id) {
        return null;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public List<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        UmsResourceExample example = new UmsResourceExample();
        UmsResourceExample.Criteria criteria = example.createCriteria();
        if(categoryId!=null){
            criteria.andCategoryIdEqualTo(categoryId);
        }
        if(StrUtil.isNotEmpty(nameKeyword)){
            criteria.andNameLike('%'+nameKeyword+'%');
        }
        if(StrUtil.isNotEmpty(urlKeyword)){
            criteria.andUrlLike('%'+urlKeyword+'%');
        }
        return resourceMapper.selectByExample(example);
    }

    @Override
    public List<UmsResource> listAll() {
        return resourceMapper.selectByExample(new UmsResourceExample());
    }

    @Override
    public Map<String, List<String>> initResourceRolesMap() {
        return null;
    }
}
