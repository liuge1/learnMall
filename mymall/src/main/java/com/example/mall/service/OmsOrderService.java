package com.example.mall.service;

import com.example.mall.dto.OmsOrderQueryParam;
import com.example.mall.mbg.model.OmsOrder;

import java.util.List;

/**
 * @Classname OmsOrderService
 * @Description 订单管理Service
 * @Date 2020/8/25 19:46
 * @Created by v_geeliu
 */
public interface OmsOrderService  {
    /**
     * 订单查询
     */
    List<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum);
}
