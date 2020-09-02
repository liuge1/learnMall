package com.example.mall.service;

import com.example.mall.mbg.model.CmsPrefrenceArea;

import java.util.List;

/**
 * @Classname CmsPrefrenceAreaService
 * @Description 优选专区Service
 * @Date 2020/8/31 11:28
 * @Created by v_geeliu
 */
public interface CmsPrefrenceAreaService {
    /**
     * 获取所有优选专区
     */
    List<CmsPrefrenceArea> listAll();
}
