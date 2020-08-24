//package com.example.mall.controller;
//
//import com.example.mall.dto.OrderParam;
//import com.example.mall.service.OmsPortalOrderService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
///**
// * @Classname OmsPortalOrderController
// * @Description 订单管理Controller
// * @Date 2020/8/24 10:25
// * @Created by v_geeliu
// */
//@Controller
//@Api(tags = "OmsPortalOrderController", description = "订单管理")
//@RequestMapping("/order")
//public class OmsPortalOrderController {
//
//    @Autowired
//    private OmsPortalOrderService portalOrderService;
//
//    @ApiOperation("根据购物车信息生成订单")
//    @RequestMapping(value = "/generateOrder", method = RequestMethod.POST)
//    @ResponseBody
//    public Object generateOrder(@RequestBody OrderParam orderParam) {
//        return portalOrderService.generateOrder(orderParam);
//    }
//}
