package com.example.mall.controller;

import com.example.mall.common.CommonResult;
import com.example.mall.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname UmsMemberController
 * @Description 会员登入注册管理
 * @Date 2020/8/19 10:00
 * @Created by v_geeliu
 */
@RestController
@Api(tags = "UmsMemberController" ,description = "会员登录注册管理")
@RequestMapping("/sso")
public class UmsMemberController {

  @Autowired
  public UmsMemberService umsMemberServiceImpl;

  @ApiOperation("获取验证码")
  @GetMapping(value = "/getAuthCode/{telephone}")
  public CommonResult getAuthCode (@PathVariable ("telephone") String telephone){

    return umsMemberServiceImpl.generateAuthCode(telephone);
  }

  @ApiOperation("判断验证码是否正确")
  @GetMapping(value = "/verifyAuthCode")
  public CommonResult updatePassword(@RequestParam String telephone,@RequestParam String authCode) {
    return umsMemberServiceImpl.verifyAuthCode(telephone,authCode);
  }

}
