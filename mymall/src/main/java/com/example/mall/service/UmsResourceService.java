package com.example.mall.service;

import com.example.mall.mbg.model.UmsResource;

import java.util.List;
import java.util.Map;

/**
 * @Classname UmsResourceService
 * @Description TODO
 * @Date 2020/8/25 17:09
 * @Created by v_geeliu
 */
public interface UmsResourceService {

    /**
    * 添加资源
     */
    int create(UmsResource umsResource);

    /**
     * 修改资源
     */
    int update(Long id, UmsResource umsResource);

    /**
     * 获取资源详情
     */
    UmsResource getItem(Long id);

    /**
     * 删除资源
     */
    int delete(Long id);

    /**
     * 分页查询资源
     */
    List<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum);

    /**
     * 查询全部资源
     */
    List<UmsResource> listAll();

    /**
     * 初始化资源角色规则
     */
    Map<String,List<String>> initResourceRolesMap();
}
