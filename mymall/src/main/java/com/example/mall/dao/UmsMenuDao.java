package com.example.mall.dao;

import com.example.mall.mbg.model.UmsMenu;
import com.example.mall.mbg.model.UmsResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname UmsMenuDao
 * @Description TODO
 * @Date 2020/8/25 10:19
 * @Created by v_geeliu
 */
public interface UmsMenuDao {

    /**
     * 根据后台用户ID获取菜单
     */
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);

    /**
     * 根据角色ID获取菜单
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);
    /**
     * 根据角色ID获取资源
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);

}
