package com.example.mall.service.impl;

import com.example.mall.dao.PmsProductCategoryDao;
import com.example.mall.dto.PmsProductCategoryWithChildrenItem;
import com.example.mall.mbg.mapper.PmsProductCategoryMapper;
import com.example.mall.mbg.model.PmsProductCategory;
import com.example.mall.mbg.model.PmsProductCategoryExample;
import com.example.mall.service.PmsProductCategoryService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname PmsProductCategoryServiceImpl
 * @Description PmsProductCategoryService实现类
 * @Date 2020/8/27 15:50
 * @Created by v_geeliu
 */
@Service
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService {
    @Autowired
    private PmsProductCategoryMapper productCategoryMapper;

    @Autowired
    private PmsProductCategoryDao productCategoryDao;

    @Override
    public List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        PmsProductCategoryExample example = new PmsProductCategoryExample();
        example.setOrderByClause("sort desc");
        example.createCriteria().andParentIdEqualTo(parentId);
        return productCategoryMapper.selectByExample(example);
    }

    @Override
    public PmsProductCategory getItem(Long id) {
        return productCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PmsProductCategoryWithChildrenItem> listWithChildren() {
        return productCategoryDao.listWithChildren();
    }
}
