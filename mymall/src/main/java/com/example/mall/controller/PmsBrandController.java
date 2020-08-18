package com.example.mall.controller;

import com.example.mall.common.CommonPage;
import com.example.mall.common.CommonResult;
import com.example.mall.mbg.model.PmsBrand;
import com.example.mall.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname PmsBrandController
 * @Description 品牌管理Controller
 * @Date 2020/8/18 17:28
 * @Created by v_geeliu
 */
@Api(tags = "PmsBrandController", description = "商品品牌管理")
@Slf4j
@Controller
@RequestMapping("/brand")
public class PmsBrandController {

  @Autowired
  private PmsBrandService pmsBrandService;

  @ApiOperation("获取所有品牌列表")
  @RequestMapping(value = "listAll", method = RequestMethod.GET)
  @ResponseBody
  public CommonResult<List<PmsBrand>> getBrandList() {
    return CommonResult.success(pmsBrandService.listAllBrand());
  }

  @ApiOperation("添加品牌")
  @RequestMapping(value = "/create", method = RequestMethod.POST)
  @ResponseBody
  public CommonResult createBrand(@RequestBody PmsBrand pmsBrand) {
    CommonResult commonResult;
    int count = pmsBrandService.createBrand(pmsBrand);
    if (count == 1) {
      commonResult = CommonResult.success(pmsBrand);
      log.debug("createBrand success:{}", pmsBrand);
    } else {
      commonResult = CommonResult.failed();
      log.debug("createBrand failed:{}", pmsBrand);
    }
    return commonResult;
  }

  @ApiOperation("更新指定id品牌信息")
  @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
  @ResponseBody
  public CommonResult updateBrand(@PathVariable("id") Long id, @RequestBody PmsBrand pmsBrandDto,
      BindingResult result) {
    CommonResult commonResult;
    int count = pmsBrandService.updateBrand(id, pmsBrandDto);
    if (count == 1) {
      commonResult = CommonResult.success(pmsBrandDto);
      log.debug("updateBrand success:{}", pmsBrandDto);
    } else {
      commonResult = CommonResult.failed();
      log.debug("updateBrand failed:{}", pmsBrandDto);
    }
    return commonResult;
  }

  @ApiOperation("删除指定id的品牌")
  @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
  @ResponseBody
  public CommonResult deleteBrand(@PathVariable("id") Long id) {
    int count = pmsBrandService.deleteBrand(id);
    if (count == 1) {
      log.debug("deleteBrand success :id={}", id);
      return CommonResult.success(null);
    } else {
      log.debug("deleteBrand failed :id={}", id);
      return CommonResult.failed();
    }
  }

  @ApiOperation("分页查询品牌列表")
  @RequestMapping(value = "/list", method = RequestMethod.GET)
  @ResponseBody
  public CommonResult<CommonPage<PmsBrand>> listBrand(
      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
      @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
    List<PmsBrand> brandList = pmsBrandService.listBrand(pageNum, pageSize);
    return CommonResult.success(CommonPage.restPage(brandList));
  }

  @ApiOperation("获取指定id的品牌详情")
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  @ResponseBody
  public CommonResult<PmsBrand> brand(@PathVariable("id") Long id) {
    return CommonResult.success(pmsBrandService.getBrand(id));
  }

}
