package com.example.mall.service;

import com.example.mall.mbg.model.OmsOrderSetting;

/**
 * @Classname OmsOrderSettingService
 * @Description 订单设置Service
 * @Date 2020/8/28 16:30
 * @Created by v_geeliu
 */
public interface OmsOrderSettingService {
    /**
     * 获取指定订单设置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
