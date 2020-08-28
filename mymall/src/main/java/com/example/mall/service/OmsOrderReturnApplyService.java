package com.example.mall.service;

import com.example.mall.dto.OmsOrderReturnApplyResult;
import com.example.mall.dto.OmsReturnApplyQueryParam;
import com.example.mall.dto.OmsUpdateStatusParam;
import com.example.mall.mbg.model.OmsOrderReturnApply;

import java.util.List;

/**
 * @Classname OmsOrderReturnApplyService
 * @Description 退货申请管理Service
 * @Date 2020/8/28 16:38
 * @Created by v_geeliu
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
