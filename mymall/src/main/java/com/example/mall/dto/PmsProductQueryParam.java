package com.example.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Classname PmsProductQueryParam
 * @Description 产品查询参数
 * @Date 2020/8/26 19:30
 * @Created by v_geeliu
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsProductQueryParam {

    @ApiModelProperty("上架状态")
    private Integer publishStatus;
    @ApiModelProperty("审核状态")
    private Integer verifyStatus;
    @ApiModelProperty("商品名称模糊关键字")
    private String keyword;
    @ApiModelProperty("商品货号")
    private String productSn;
    @ApiModelProperty("商品分类编号")
    private Long productCategoryId;
    @ApiModelProperty("商品品牌编号")
    private Long brandId;
}

