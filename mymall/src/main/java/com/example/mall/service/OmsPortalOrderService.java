//package com.example.mall.service;
//
//import com.example.mall.common.CommonPage;
//import com.example.mall.common.CommonResult;
//import com.example.mall.dto.OmsOrderDetail;
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
//
//    /**
//     * 分页获取用户订单
//     */
//    CommonPage<OmsOrderDetail> list(Integer status, Integer pageNum, Integer pageSize);
//
////    /**
////     * 根据提交信息生成订单
////     */
////    @Transactional
////    CommonResult generateOrder(OrderParam orderParam);
////
////    /**
////     * 取消单个超时订单
////     */
////    @Transactional
////    void cancelOrder(Long orderId);
//}
