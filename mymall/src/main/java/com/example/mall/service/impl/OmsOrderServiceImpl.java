package com.example.mall.service.impl;

import com.example.mall.dao.OmsOrderDao;
import com.example.mall.dto.OmsOrderQueryParam;
import com.example.mall.mbg.mapper.OmsOrderMapper;
import com.example.mall.mbg.model.OmsOrder;
import com.example.mall.service.OmsOrderService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname OmsOrderServiceImpl
 * @Description TODO
 * @Date 2020/8/25 19:48
 * @Created by v_geeliu
 */
@Service
public class OmsOrderServiceImpl implements OmsOrderService {
    @Autowired
    private OmsOrderMapper orderMapper;
    @Autowired
    private OmsOrderDao orderDao;

    @Override
    public List<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return orderDao.getList(queryParam);
    }
}
