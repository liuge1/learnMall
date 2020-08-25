package com.example.mall.service.impl;

import com.example.mall.mbg.mapper.UmsResourceCategoryMapper;
import com.example.mall.mbg.model.UmsResourceCategory;
import com.example.mall.mbg.model.UmsResourceCategoryExample;
import com.example.mall.service.UmsResourceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname UmsResourceCategoryServiceImpl
 * @Description TODO
 * @Date 2020/8/25 17:23
 * @Created by v_geeliu
 */
@Service
public class UmsResourceCategoryServiceImpl implements UmsResourceCategoryService {
    @Autowired
    private UmsResourceCategoryMapper resourceCategoryMapper;


    @Override
    public List<UmsResourceCategory> listAll() {
        UmsResourceCategoryExample example = new UmsResourceCategoryExample();
        example.setOrderByClause("sort desc");
        return resourceCategoryMapper.selectByExample(example);
    }

    @Override
    public int create(UmsResourceCategory umsResourceCategory) {
        return 0;
    }

    @Override
    public int update(Long id, UmsResourceCategory umsResourceCategory) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }
}
