package com.example.mall.service;

import com.example.mall.dto.PmsProductAttributeCategoryItem;
import com.example.mall.mbg.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * @Classname PmsProductAttributeCategoryService
 * @Description TODO
 * @Date 2020/8/27 16:40
 * @Created by v_geeliu
 */
public interface PmsProductAttributeCategoryService {
    /**
     * 创建属性分类
     */
    int create(String name);

    /**
     * 修改属性分类
     */
    int update(Long id, String name);

    /**
     * 删除属性分类
     */
    int delete(Long id);

    /**
     * 获取属性分类详情
     */
    PmsProductAttributeCategory getItem(Long id);

    /**
     * 分页查询属性分类
     */
    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    /**
     * 获取包含属性的属性分类
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
