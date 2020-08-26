package com.example.mall.dto;

import com.example.mall.mbg.model.UmsAdmin;
import com.example.mall.mbg.model.UmsPermission;
import com.example.mall.mbg.model.UmsResource;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Classname AdminUserDetails
 * @Description 需要的用户详情
 * @Date 2020/8/19 16:13
 * @Created by v_geeliu
 */
@AllArgsConstructor
public class AdminUserDetails implements UserDetails {

    private UmsAdmin umsAdmin;
    private List<UmsResource> resourceList;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return resourceList.stream()
        .map(role-> new SimpleGrantedAuthority(role.getId()+":"+role.getName())).collect(Collectors.toList());

    }

    @Override
    public String getPassword() {
        return umsAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return umsAdmin.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
