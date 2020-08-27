package com.example.mall.service;

import com.example.mall.mbg.model.PmsBrand;
import java.util.List;

/**
 * @Classname PmsBrandService
 * @Description TODO
 * @Date 2020/8/18 11:35
 * @Created by v_geeliu
 */
public interface PmsBrandService {

  List<PmsBrand> listAllBrand();

  int createBrand(PmsBrand brand);

  int updateBrand(Long id, PmsBrand brand);

  int deleteBrand(Long id);

  List<PmsBrand> listBrand(int pageNum, int pageSize);

  PmsBrand getBrand(Long id);

}
