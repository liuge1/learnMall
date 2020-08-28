package com.example.mall.dto;

import com.example.mall.mbg.model.OmsCompanyAddress;
import com.example.mall.mbg.model.OmsOrderReturnApply;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Classname OmsOrderReturnApplyResult
 * @Description 申请信息封装
 * @Date 2020/8/28 16:40
 * @Created by v_geeliu
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    @ApiModelProperty(value = "公司收货地址")
    private OmsCompanyAddress companyAddress;
}
