package com.example.mall.dao;

import com.example.mall.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * @Classname PmsProductCategoryDao
 * @Description 商品分类自定义Dao
 * @Date 2020/8/27 15:51
 * @Created by v_geeliu
 */
public interface PmsProductCategoryDao {
    /**
     * 获取商品分类及其子分类
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
