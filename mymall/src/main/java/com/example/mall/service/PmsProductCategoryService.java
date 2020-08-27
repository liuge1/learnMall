package com.example.mall.service;

import com.example.mall.dto.PmsProductCategoryWithChildrenItem;
import com.example.mall.mbg.model.PmsProductCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname PmsProductCategoryService
 * @Description TODO
 * @Date 2020/8/27 15:49
 * @Created by v_geeliu
 */
public interface PmsProductCategoryService {
//    /**
//     * 创建商品分类
//     */
//    @Transactional
//    int create(PmsProductCategoryParam pmsProductCategoryParam);
//
//    /**
//     * 修改商品分类
//     */
//    @Transactional
//    int update(Long id, PmsProductCategoryParam pmsProductCategoryParam);
//
    /**
     * 分页获取商品分类
     */
    List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);
//
//    /**
//     * 删除商品分类
//     */
//    int delete(Long id);
//
    /**
     * 根据ID获取商品分类
     */
    PmsProductCategory getItem(Long id);
//
//    /**
//     * 批量修改导航状态
//     */
//    int updateNavStatus(List<Long> ids, Integer navStatus);
//
//    /**
//     * 批量修改显示状态
//     */
//    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 以层级形式获取商品分类
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
