package com.example.mall.service.impl;

import com.example.mall.mbg.mapper.OmsOrderSettingMapper;
import com.example.mall.mbg.model.OmsOrderSetting;
import com.example.mall.service.OmsOrderSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname OmsOrderSettingServiceImpl
 * @Description TODO
 * @Date 2020/8/28 16:30
 * @Created by v_geeliu
 */
@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {

    @Autowired
    private OmsOrderSettingMapper orderSettingMapper;

    @Override
    public OmsOrderSetting getItem(Long id) {
        return orderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Long id, OmsOrderSetting orderSetting) {
        orderSetting.setId(id);
        return orderSettingMapper.updateByPrimaryKey(orderSetting);
    }
}
