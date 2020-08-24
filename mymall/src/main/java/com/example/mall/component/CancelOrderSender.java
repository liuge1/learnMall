//package com.example.mall.component;
//
//import com.example.mall.dto.QueueEnum;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.AmqpException;
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.core.MessagePostProcessor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// * @Classname CancelOrderSender
// * @Description 取消订单消息的发出者
// * @Date 2020/8/24 10:09
// * @Created by v_geeliu
// */
//@Slf4j
//@Component
//public class CancelOrderSender {
//
//    @Autowired
//    private AmqpTemplate amqpTemplate;
//
//    public void sendMessage(Long orderId, final long delayTimes) {
//        //给延迟队列发送消息
//        amqpTemplate.convertAndSend(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getExchange(),
//                QueueEnum.QUEUE_TTL_ORDER_CANCEL.getRouteKey(), orderId, new MessagePostProcessor() {
//                    @Override
//                    public Message postProcessMessage(Message message) throws AmqpException {
//                        //给消息设置延迟毫秒值
//                        message.getMessageProperties().setExpiration(String.valueOf(delayTimes));
//                        return message;
//                    }
//                });
//        log.info("send delay message orderId:{}", orderId);
//
//    }
//}
//
//
//
//
//
