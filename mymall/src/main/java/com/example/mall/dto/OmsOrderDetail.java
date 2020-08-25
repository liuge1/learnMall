package com.example.mall.dto;

import com.example.mall.mbg.model.OmsOrder;
import com.example.mall.mbg.model.OmsOrderItem;
import lombok.Data;

import java.util.List;

/**
 * @Classname OmsOrderDetail
 * @Description 包含订单商品信息的订单详情
 * @Date 2020/8/25 19:32
 * @Created by v_geeliu
 */
@Data
public class OmsOrderDetail extends OmsOrder {

    private List<OmsOrderItem> orderItemList;

}
