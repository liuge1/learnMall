package com.example.mall.dto;

import com.example.mall.mbg.model.PmsProductAttribute;
import com.example.mall.mbg.model.PmsProductAttributeCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Classname PmsProductAttributeCategoryItem
 * @Description TODO
 * @Date 2020/8/27 16:39
 * @Created by v_geeliu
 */
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    @Getter
    @Setter
    @ApiModelProperty(value = "商品属性列表")
    private List<PmsProductAttribute> productAttributeList;
}
