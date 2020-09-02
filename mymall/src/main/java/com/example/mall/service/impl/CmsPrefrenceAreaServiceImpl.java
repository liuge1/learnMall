package com.example.mall.service.impl;

import com.example.mall.mbg.mapper.CmsPrefrenceAreaMapper;
import com.example.mall.mbg.model.CmsPrefrenceArea;
import com.example.mall.mbg.model.CmsPrefrenceAreaExample;
import com.example.mall.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname CmsPrefrenceAreaServiceImpl
 * @Description TODO
 * @Date 2020/8/31 11:28
 * @Created by v_geeliu
 */
@Service
public class CmsPrefrenceAreaServiceImpl  implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;
    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
