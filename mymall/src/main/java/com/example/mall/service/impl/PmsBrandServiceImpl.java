package com.example.mall.service.impl;

import com.example.mall.mbg.mapper.PmsBrandMapper;
import com.example.mall.mbg.model.PmsBrand;
import com.example.mall.mbg.model.PmsBrandExample;
import com.example.mall.service.PmsBrandService;
import com.github.pagehelper.PageHelper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname PmsBrandServiceImpl
 * @Description TODO
 * @Date 2020/8/18 17:48
 * @Created by v_geeliu
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {

  @Autowired
  private PmsBrandMapper brandMapper;

  @Override
  public List<PmsBrand> listAllBrand() {
    return brandMapper.selectByExample(new PmsBrandExample());
  }

  @Override
  public int createBrand(PmsBrand brand) {
    return brandMapper.insertSelective(brand);
  }

  @Override
  public int updateBrand(Long id, PmsBrand brand) {
    brand.setId(id);
    return brandMapper.updateByPrimaryKeySelective(brand);
  }

  @Override
  public int deleteBrand(Long id) {
    return brandMapper.deleteByPrimaryKey(id);
  }

  @Override
  public List<PmsBrand> listBrand(int pageNum, int pageSize) {
    PageHelper.startPage(pageNum, pageSize);
    return brandMapper.selectByExample(new PmsBrandExample());
  }

  @Override
  public PmsBrand getBrand(Long id) {
    return brandMapper.selectByPrimaryKey(id);
  }
}
