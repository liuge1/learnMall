package com.example.mall.service;

import com.example.mall.mbg.model.OmsCompanyAddress;

import java.util.List;

/**
 * @Classname OmsCompanyAddressService
 * @Description 收货地址管Service
 * @Date 2020/8/28 16:54
 * @Created by v_geeliu
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
