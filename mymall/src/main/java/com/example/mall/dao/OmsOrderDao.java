package com.example.mall.dao;

import com.example.mall.dto.OmsOrderQueryParam;
import com.example.mall.mbg.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname OmsOrderDao
 * @Description TODO
 * @Date 2020/8/25 19:50
 * @Created by v_geeliu
 */
public interface OmsOrderDao {

    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

}
