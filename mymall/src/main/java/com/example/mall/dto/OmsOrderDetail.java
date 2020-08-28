package com.example.mall.dto;

import com.example.mall.mbg.model.OmsOrder;
import com.example.mall.mbg.model.OmsOrderItem;
import com.example.mall.mbg.model.OmsOrderOperateHistory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Classname OmsOrderDetail
 * @Description 包含订单商品信息的订单详情
 * @Date 2020/8/25 19:32
 * @Created by v_geeliu
 */
@Data
public class OmsOrderDetail extends OmsOrder {

    @Getter
    @Setter
    @ApiModelProperty("订单商品列表")
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    @ApiModelProperty("订单操作记录列表")
    private List<OmsOrderOperateHistory> historyList;

}
