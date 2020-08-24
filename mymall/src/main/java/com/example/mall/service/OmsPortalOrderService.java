//package com.example.mall.service;
//
//import com.example.mall.common.CommonResult;
//import com.example.mall.dto.OrderParam;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// * @Classname OmsPortalOrderService
// * @Description 前台订单管理Service
// * @Date 2020/8/24 10:19
// * @Created by v_geeliu
// */
//public interface OmsPortalOrderService {
//
//    /**
//     * 根据提交信息生成订单
//     */
//    @Transactional
//    CommonResult generateOrder(OrderParam orderParam);
//
//    /**
//     * 取消单个超时订单
//     */
//    @Transactional
//    void cancelOrder(Long orderId);
//}
