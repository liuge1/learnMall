package com.example.mall.service.impl;

import com.example.mall.dao.SmsFlashPromotionProductRelationDao;
import com.example.mall.dto.SmsFlashPromotionProduct;
import com.example.mall.mbg.mapper.SmsFlashPromotionProductRelationMapper;
import com.example.mall.mbg.model.SmsFlashPromotionProductRelation;
import com.example.mall.mbg.model.SmsFlashPromotionProductRelationExample;
import com.example.mall.service.SmsFlashPromotionProductRelationService;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname SmsFlashPromotionProductRelationServiceImpl
 * @Description TODO
 * @Date 2020/8/31 17:01
 * @Created by v_geeliu
 */
@Service
@Slf4j
public class SmsFlashPromotionProductRelationServiceImpl implements SmsFlashPromotionProductRelationService {

    @Autowired
    private SmsFlashPromotionProductRelationMapper relationMapper;
    @Autowired
    private SmsFlashPromotionProductRelationDao relationDao;

    @Override
    public int create(List<SmsFlashPromotionProductRelation> relationList) {
        for (SmsFlashPromotionProductRelation relation : relationList) {
            relationMapper.insert(relation);
        }
        return relationList.size();
    }

    @Override
    public int update(Long id, SmsFlashPromotionProductRelation relation) {
        relation.setId(id);
        return relationMapper.updateByPrimaryKey(relation);
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public SmsFlashPromotionProductRelation getItem(Long id) {
        return null;
    }

    @Override
    public List<SmsFlashPromotionProduct> list(Long flashPromotionId, Long flashPromotionSessionId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return relationDao.getList(flashPromotionId,flashPromotionSessionId);
    }

    @Override
    public long getCount(Long flashPromotionId, Long flashPromotionSessionId) {
        SmsFlashPromotionProductRelationExample example = new SmsFlashPromotionProductRelationExample();
        example.createCriteria()
                .andFlashPromotionIdEqualTo(flashPromotionId)
                .andFlashPromotionSessionIdEqualTo(flashPromotionSessionId);
        return relationMapper.countByExample(example);
    }
}
