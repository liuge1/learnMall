package com.example.mall.service.impl;

import com.example.mall.dao.PmsProductAttributeCategoryDao;
import com.example.mall.dao.PmsProductAttributeDao;
import com.example.mall.dto.PmsProductAttributeParam;
import com.example.mall.dto.ProductAttrInfo;
import com.example.mall.mbg.mapper.PmsProductAttributeCategoryMapper;
import com.example.mall.mbg.mapper.PmsProductAttributeMapper;
import com.example.mall.mbg.model.PmsProductAttribute;
import com.example.mall.service.PmsProductAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname PmsProductAttributeServiceImpl
 * @Description TODO
 * @Date 2020/8/27 17:05
 * @Created by v_geeliu
 */
@Service
public class PmsProductAttributeServiceImpl implements PmsProductAttributeService {

    @Autowired
    private PmsProductAttributeMapper productAttributeMapper;
    @Autowired
    private PmsProductAttributeCategoryMapper productAttributeCategoryMapper;
    @Autowired
    private PmsProductAttributeDao productAttributeDao;

    @Override
    public List<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public int create(PmsProductAttributeParam pmsProductAttributeParam) {
        return 0;
    }

    @Override
    public int update(Long id, PmsProductAttributeParam productAttributeParam) {
        return 0;
    }

    @Override
    public PmsProductAttribute getItem(Long id) {
        return null;
    }

    @Override
    public int delete(List<Long> ids) {
        return 0;
    }

    @Override
    public List<ProductAttrInfo> getProductAttrInfo(Long productCategoryId) {
        return productAttributeDao.getProductAttrInfo(productCategoryId);
    }
}
