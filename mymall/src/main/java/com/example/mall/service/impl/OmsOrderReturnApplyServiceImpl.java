package com.example.mall.service.impl;

import com.example.mall.dao.OmsOrderReturnApplyDao;
import com.example.mall.dto.OmsOrderReturnApplyResult;
import com.example.mall.dto.OmsReturnApplyQueryParam;
import com.example.mall.dto.OmsUpdateStatusParam;
import com.example.mall.mbg.mapper.OmsOrderReturnApplyMapper;
import com.example.mall.mbg.model.OmsOrderReturnApply;
import com.example.mall.service.OmsOrderReturnApplyService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname OmsOrderReturnApplyServiceImpl
 * @Description TODO
 * @Date 2020/8/28 16:41
 * @Created by v_geeliu
 */
@Service
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService {
    @Autowired
    private OmsOrderReturnApplyDao returnApplyDao;
    @Autowired
    private OmsOrderReturnApplyMapper returnApplyMapper;


    @Override
    public List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return returnApplyDao.getList(queryParam);
    }

    @Override
    public int delete(List<Long> ids) {
        return 0;
    }

    @Override
    public int updateStatus(Long id, OmsUpdateStatusParam statusParam) {
        return 0;
    }

    @Override
    public OmsOrderReturnApplyResult getItem(Long id) {
        return returnApplyDao.getDetail(id);
    }
}
