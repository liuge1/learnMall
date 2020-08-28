package com.example.mall.service.impl;

import com.example.mall.mbg.mapper.OmsCompanyAddressMapper;
import com.example.mall.mbg.model.OmsCompanyAddress;
import com.example.mall.mbg.model.OmsCompanyAddressExample;
import com.example.mall.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname OmsCompanyAddressServiceImpl
 * @Description TODO
 * @Date 2020/8/28 16:55
 * @Created by v_geeliu
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
