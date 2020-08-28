package com.example.mall.dao;

import com.example.mall.dto.OmsOrderReturnApplyResult;
import com.example.mall.dto.OmsReturnApplyQueryParam;
import com.example.mall.mbg.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname OmsOrderReturnApplyDao
 * @Description TODO
 * @Date 2020/8/28 16:42
 * @Created by v_geeliu
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);
}
