package com.example.mall.service;

import com.example.mall.dto.PmsProductQueryParam;
import com.example.mall.mbg.model.PmsProduct;

import java.util.List;

/**
 * @Classname PmsProductService
 * @Description TODO
 * @Date 2020/8/26 19:31
 * @Created by v_geeliu
 */
public interface PmsProductService {

    /**
     * 分页查询商品
     */
    List<PmsProduct> list(PmsProductQueryParam productQueryParam, Integer pageSize, Integer pageNum);

}
