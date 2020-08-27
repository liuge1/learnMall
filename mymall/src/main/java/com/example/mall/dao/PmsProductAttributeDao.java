package com.example.mall.dao;

import com.example.mall.dto.ProductAttrInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname PmsProductAttributeDao
 * @Description TODO
 * @Date 2020/8/27 17:07
 * @Created by v_geeliu
 */
public interface PmsProductAttributeDao {

    /**
     * 获取商品属性信息
     */
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
