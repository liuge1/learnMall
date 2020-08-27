package com.example.mall.dao;

import com.example.mall.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * @Classname PmsProductAttributeCategoryDao
 * @Description 自定义商品属性分类Dao
 * @Date 2020/8/27 16:42
 * @Created by v_geeliu
 */
public interface PmsProductAttributeCategoryDao {

    /**
     * 获取包含属性的商品属性分类
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();

}
