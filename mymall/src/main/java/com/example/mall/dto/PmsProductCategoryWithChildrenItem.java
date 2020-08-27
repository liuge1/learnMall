package com.example.mall.dto;

import com.example.mall.mbg.model.PmsProductCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Classname PmsProductCategoryWithChildrenItem
 * @Description TODO
 * @Date 2020/8/27 15:48
 * @Created by v_geeliu
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
    @Getter
    @Setter
    @ApiModelProperty("子级分类")
    private List<PmsProductCategory> children;
}
