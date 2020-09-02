package com.example.mall.service;

import com.example.mall.dto.SmsFlashPromotionSessionDetail;
import com.example.mall.mbg.model.SmsFlashPromotionSession;

import java.util.List;

/**
 * @Classname SmsFlashPromotionSessionService
 * @Description 限时购场次管理Service
 * @Date 2020/8/31 16:58
 * @Created by v_geeliu
 */
public interface SmsFlashPromotionSessionService {
    /**
     * 添加场次
     */
    int create(SmsFlashPromotionSession promotionSession);

    /**
     * 修改场次
     */
    int update(Long id, SmsFlashPromotionSession promotionSession);

    /**
     * 修改场次启用状态
     */
    int updateStatus(Long id, Integer status);

    /**
     * 删除场次
     */
    int delete(Long id);

    /**
     * 获取详情
     */
    SmsFlashPromotionSession getItem(Long id);

    /**
     * 根据启用状态获取场次列表
     */
    List<SmsFlashPromotionSession> list();

    /**
     * 获取全部可选场次及其数量
     */
    List<SmsFlashPromotionSessionDetail> selectList(Long flashPromotionId);
}
