package com.example.mall.dao;

import com.example.mall.mbg.model.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname PmsMemberPriceDao
 * @Description 自定义会员价格Dao
 * @Date 2020/8/31 15:35
 * @Created by v_geeliu
 */
public interface PmsMemberPriceDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);
}
