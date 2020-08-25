package com.example.mall.service;

import com.example.mall.mbg.model.UmsResourceCategory;

import java.util.List;

/**
 * @Classname UmsResourceCategoryService
 * @Description  后台资源分类管理Service
 * @Date 2020/8/25 17:23
 * @Created by v_geeliu
 */
public interface UmsResourceCategoryService {
    /**
     * 获取所有资源分类
     */
    List<UmsResourceCategory> listAll();

    /**
     * 创建资源分类
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * 修改资源分类
     */
    int update(Long id, UmsResourceCategory umsResourceCategory);

    /**
     * 删除资源分类
     */
    int delete(Long id);
}
