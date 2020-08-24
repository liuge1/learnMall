//package com.example.mall.controller;
//
//import com.example.mall.common.CommonResult;
//import com.example.mall.nosql.mongodb.document.MemberReadHistory;
//import com.example.mall.service.MemberReadHistoryService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
///**
// * @Classname 会员商品浏览记录管理Controller
// * @Description TODO
// * @Date 2020/8/20 17:16
// * @Created by v_geeliu
// */
//
//@RestController
//@Api(tags = "MemberReadHistoryController", description = "会员商品浏览记录管理")
//@RequestMapping("/member/readHistory")
//public class MemberReadHistoryController {
//    @Autowired
//    private MemberReadHistoryService memberReadHistoryService;
//
//    @ApiOperation("创建浏览记录")
//    @PostMapping(value = "/create")
//    @ResponseBody
//    public CommonResult create(@RequestBody MemberReadHistory memberReadHistory) {
//        int count = memberReadHistoryService.create(memberReadHistory);
//        if (count > 0) {
//            return CommonResult.success(count);
//        } else {
//            return CommonResult.failed();
//        }
//    }
//
//    @ApiOperation("删除浏览记录")
//    @PostMapping(value = "/delete")
//    @ResponseBody
//    public CommonResult delete(@RequestParam("ids") List<String> ids) {
//        int count = memberReadHistoryService.delete(ids);
//        if (count > 0) {
//            return CommonResult.success(count);
//        } else {
//            return CommonResult.failed();
//        }
//    }
//
//    @ApiOperation("展示浏览记录")
//    @GetMapping(value = "/list/{memberId}")
//    @ResponseBody
//    public CommonResult<List<MemberReadHistory>> list(@PathVariable Long memberId) {
//        List<MemberReadHistory> memberReadHistoryList = memberReadHistoryService.list(memberId);
//        return CommonResult.success(memberReadHistoryList);
//    }
//}
