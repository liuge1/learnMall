package com.example.mall.dao;

import com.example.mall.mbg.model.PmsProductLadder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname PmsProductLadderDao
 * @Description 自定义会员阶梯价格Dao
 * @Date 2020/8/31 15:37
 * @Created by v_geeliu
 */
public interface PmsProductLadderDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductLadder> productLadderList);
}
