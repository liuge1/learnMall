package com.example.mall.service.impl;

import com.example.mall.dao.EsProductDao;
import com.example.mall.nosql.elasticsearch.document.EsProduct;
import com.example.mall.nosql.elasticsearch.repository.EsProductRepository;
import com.example.mall.service.EsProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname EsProductServiceImpl
 * @Description TODO
 * @Date 2020/8/20 15:30
 * @Created by v_geeliu
 */
@Slf4j
@Service
public class EsProductServiceImpl implements EsProductService {

    @Autowired
    private EsProductDao esProductDao;

    @Autowired
    private EsProductRepository esProductRepository;

    @Override
    public int importAll() {
        List<EsProduct> esProductList = esProductDao.getAllEsProductList(null);
        Iterable<EsProduct> esProductIterable = esProductRepository.saveAll(esProductList);
        Iterator<EsProduct> iterator = esProductIterable.iterator();
        int result = 0;
        while (iterator.hasNext()) {
            result++;
            iterator.next();
        }
        return result;
    }

    @Override
    public void delete(Long id) {
        esProductRepository.deleteById(id);
    }

    @Override
    public EsProduct create(Long id) {
        EsProduct result =null;
        List<EsProduct> esProductList = esProductDao.getAllEsProductList(id);
        if(!CollectionUtils.isEmpty(esProductList)){
            EsProduct esProduct = esProductList.get(0);
            result=esProductRepository.save(esProduct);
        }
        return result;
    }

    @Override
    public void delete(List<Long> ids) {
        if(!CollectionUtils.isEmpty(ids)){
            List<EsProduct> esProductList = new ArrayList<>();
            for (Long id : ids) {
                EsProduct esProduct = new EsProduct();
                esProduct.setId(id);
                esProductList.add(esProduct);
            }
            esProductRepository.deleteAll(esProductList);
        }
    }

    @Override
    public Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        return esProductRepository.findByNameOrSubTitleOrKeywords(keyword, keyword, keyword, pageable);

    }
}
