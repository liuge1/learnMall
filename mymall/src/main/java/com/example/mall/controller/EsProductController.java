//package com.example.mall.controller;
//
//import com.example.mall.common.CommonPage;
//import com.example.mall.common.CommonResult;
//import com.example.mall.nosql.elasticsearch.document.EsProduct;
//import com.example.mall.service.EsProductService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
///**
// * @Classname EsProductController
// * @Description TODO
// * @Date 2020/8/20 15:51
// * @Created by v_geeliu
// */
//@RestController
//@Api(tags = "EsProductController",description = "搜索商品管理")
//@RequestMapping("/esProduct")
//public class EsProductController {
//    @Autowired
//    private EsProductService esProductService;
//
//    @ApiOperation(value = "导入所有数据库中商品到ES")
//    @PostMapping(value = "/importAll")
//    @ResponseBody
//    public CommonResult<Integer> importAllList() {
//        int count = esProductService.importAll();
//        return CommonResult.success(count);
//    }
//
//    @ApiOperation(value = "根据id删除商品")
//    @GetMapping(value = "/delete/{id}")
//    @ResponseBody
//    public CommonResult<Object> delete(@PathVariable Long id) {
//        esProductService.delete(id);
//        return CommonResult.success(null);
//    }
//
//    @ApiOperation(value = "根据id创建商品")
//    @GetMapping(value = "/create/{id}")
//    @ResponseBody
//    public CommonResult<EsProduct> create(@PathVariable Long id) {
//        EsProduct esProduct = esProductService.create(id);
//        if (esProduct != null) {
//            return CommonResult.success(esProduct);
//        } else {
//            return CommonResult.failed();
//        }
//    }
//
//    @ApiOperation(value = "简单搜索")
//    @GetMapping(value = "/search/simple")
//    @ResponseBody
//    public CommonResult<CommonPage<EsProduct>> search(@RequestParam(required = false) String keyword,
//                                                      @RequestParam(required = false, defaultValue = "0") Integer pageNum,
//                                                      @RequestParam(required = false, defaultValue = "5") Integer pageSize) {
//        Page<EsProduct> esProductPage = esProductService.search(keyword, pageNum, pageSize);
//        return CommonResult.success(CommonPage.restPage(esProductPage));
//    }
//}
