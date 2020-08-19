package com.example.mall.service;

import com.example.mall.common.CommonResult;

/**
 * @Classname UmsMemberService
 * @Description TODO
 * @Date 2020/8/19 10:03
 * @Created by v_geeliu
 */
public interface UmsMemberService {

  /**
   * 生成验证码
   */
  CommonResult generateAuthCode(String telephone);

  /**
   * 判断验证码和手机号码是否匹配
   */
  CommonResult verifyAuthCode(String telephone, String authCode);

}
