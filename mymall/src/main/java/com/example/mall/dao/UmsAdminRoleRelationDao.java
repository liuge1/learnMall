package com.example.mall.dao;

import com.example.mall.mbg.model.UmsPermission;
import com.example.mall.mbg.model.UmsResource;
import com.example.mall.mbg.model.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname AdminRoleRelationDao
 * @Description TODO
 * @Date 2020/8/19 16:26
 * @Created by v_geeliu
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);


    /**
     * 获取用户所有可访问资源
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);


}
