package com.example.mall.dto;

import lombok.Data;

/**
 * @Classname OrderParam
 * @Description 生成订单时传入的参数
 * @Date 2020/8/24 10:20
 * @Created by v_geeliu
 */
@Data
public class OrderParam {
    //收货地址id
    private Long memberReceiveAddressId;
    //优惠券id
    private Long couponId;
    //使用的积分数
    private Integer useIntegration;
    //支付方式
    private Integer payType;
}
