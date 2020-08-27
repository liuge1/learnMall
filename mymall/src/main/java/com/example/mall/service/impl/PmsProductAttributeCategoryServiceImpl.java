package com.example.mall.service.impl;

import com.example.mall.dao.PmsProductAttributeCategoryDao;
import com.example.mall.dto.PmsProductAttributeCategoryItem;
import com.example.mall.mbg.mapper.PmsProductAttributeCategoryMapper;
import com.example.mall.mbg.model.PmsProductAttributeCategory;
import com.example.mall.service.PmsProductAttributeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname PmsProductAttributeCategoryServiceImpl
 * @Description 商品属性分类Service
 * @Date 2020/8/27 16:40
 * @Created by v_geeliu
 */
@Service
public class PmsProductAttributeCategoryServiceImpl implements PmsProductAttributeCategoryService {
    @Autowired
    private PmsProductAttributeCategoryMapper productAttributeCategoryMapper;
    @Autowired
    private PmsProductAttributeCategoryDao productAttributeCategoryDao;

    @Override
    public int create(String name) {
        return 0;
    }

    @Override
    public int update(Long id, String name) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public PmsProductAttributeCategory getItem(Long id) {
        return null;
    }

    @Override
    public List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public List<PmsProductAttributeCategoryItem> getListWithAttr() {
        return productAttributeCategoryDao.getListWithAttr();
    }
}
