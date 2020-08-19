package com.example.mall.dao;

import com.example.mall.mbg.model.UmsPermission;
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
}
