//package com.example.mall.service.impl;
//
//import cn.hutool.core.bean.BeanUtil;
//import cn.hutool.core.collection.CollUtil;
//import com.example.mall.common.CommonPage;
//import com.example.mall.common.CommonResult;
//
//import com.example.mall.dto.OmsOrderDetail;
//import com.example.mall.dto.OrderParam;
//import com.example.mall.mbg.mapper.OmsOrderItemMapper;
//import com.example.mall.mbg.mapper.OmsOrderMapper;
//import com.example.mall.mbg.model.OmsOrder;
//import com.example.mall.mbg.model.OmsOrderExample;
//import com.example.mall.mbg.model.OmsOrderItem;
//import com.example.mall.mbg.model.OmsOrderItemExample;
//import com.example.mall.service.OmsPortalOrderService;
//import com.github.pagehelper.PageHelper;
//import lombok.Data;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * @Classname OmsPortalOrderServiceImpl
// * @Description  前台订单管理Service
// * @Date 2020/8/24 10:21
// * @Created by v_geeliu
// */
//@Slf4j
//@Service
//
//public class OmsPortalOrderServiceImpl implements OmsPortalOrderService {
//
//    @Autowired
//    private OmsOrderMapper orderMapper;
//    @Autowired
//    private OmsOrderItemMapper orderItemMapper;
//
//    @Override
//    public CommonPage<OmsOrderDetail> list(Integer status, Integer pageNum, Integer pageSize) {
//        if(status==-1){
//            status = null;
//        }
//        UmsMember member = memberService.getCurrentMember();
//        PageHelper.startPage(pageNum,pageSize);
//        OmsOrderExample orderExample = new OmsOrderExample();
//        OmsOrderExample.Criteria criteria = orderExample.createCriteria();
//        criteria.andDeleteStatusEqualTo(0)
//                .andMemberIdEqualTo(member.getId());
//        if(status!=null){
//            criteria.andStatusEqualTo(status);
//        }
//        orderExample.setOrderByClause("create_time desc");
//        List<OmsOrder> orderList = orderMapper.selectByExample(orderExample);
//        CommonPage<OmsOrder> orderPage = CommonPage.restPage(orderList);
//        //设置分页信息
//        CommonPage<OmsOrderDetail> resultPage = new CommonPage<>();
//        resultPage.setPageNum(orderPage.getPageNum());
//        resultPage.setPageSize(orderPage.getPageSize());
//        resultPage.setTotal(orderPage.getTotal());
//        resultPage.setTotalPage(orderPage.getTotalPage());
//        if(CollUtil.isEmpty(orderList)){
//            return resultPage;
//        }
//        //设置数据信息
//        List<Long> orderIds = orderList.stream().map(OmsOrder::getId).collect(Collectors.toList());
//        OmsOrderItemExample orderItemExample = new OmsOrderItemExample();
//        orderItemExample.createCriteria().andOrderIdIn(orderIds);
//        List<OmsOrderItem> orderItemList = orderItemMapper.selectByExample(orderItemExample);
//        List<OmsOrderDetail> orderDetailList = new ArrayList<>();
//        for (OmsOrder omsOrder : orderList) {
//            OmsOrderDetail orderDetail = new OmsOrderDetail();
//            BeanUtil.copyProperties(omsOrder,orderDetail);
//            List<OmsOrderItem> relatedItemList = orderItemList.stream().filter(item -> item.getOrderId().equals(orderDetail.getId())).collect(Collectors.toList());
//            orderDetail.setOrderItemList(relatedItemList);
//            orderDetailList.add(orderDetail);
//        }
//        resultPage.setList(orderDetailList);
//        return resultPage;
//    }
////    @Autowired
////    private CancelOrderSender cancelOrderSender;
////
////    @Override
////    public CommonResult generateOrder(OrderParam orderParam) {
////        //todo 执行一系类下单操作，具体参考mall项目
////        log.info("process generateOrder");
////        //下单完成后开启一个延迟消息，用于当用户没有付款时取消订单（orderId应该在下单后生成）
////        sendDelayMessageCancelOrder(11L);
////        return CommonResult.success(null, "下单成功");
////    }
////
////    @Override
////    public void cancelOrder(Long orderId) {
////        //todo 执行一系类取消订单操作，具体参考mall项目
////        log.info("process cancelOrder orderId:{}",orderId);
////    }
////
////    private void sendDelayMessageCancelOrder(Long orderId) {
////        //获取订单超时时间，假设为60分钟(测试用的30秒)
////        long delayTimes = 30 * 1000;
////        //发送延迟消息
////        cancelOrderSender.sendMessage(orderId, delayTimes);
//////    }
//}
