package com.example.mall.service.impl;

import com.example.mall.common.CommonResult;
import com.example.mall.service.RedisService;
import com.example.mall.service.UmsMemberService;
import io.swagger.annotations.ApiOperation;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @Classname UmsMemberServiceImpl
 * @Description TODO
 * @Date 2020/8/19 10:04
 * @Created by v_geeliu
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {


  @Autowired
  private RedisService redisService;

  @Value("${redis.key.prefix.authCode}")
  private String REDIS_KEY_PREFIX_AUTH_CODE;

  @Value("${redis.key.expire.authCode}")
  private Long AUTH_CODE_EXPIRE_SECONDS;

  @Override
  public CommonResult generateAuthCode(String telephone) {
//    StringBuilder sb = new StringBuilder();
//    Random random = new Random();
//    for (int i = 0; i < 6; i++) {
//      sb.append(random.nextInt(10));
//    }
    //直接生成六位短信验证码
    String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);
    redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telephone, verifyCode);
    redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telephone, AUTH_CODE_EXPIRE_SECONDS);
    return CommonResult.success(verifyCode, "获取验证码成功");
  }

  @Override
  public CommonResult verifyAuthCode(String telephone, String authCode) {
    if (StringUtils.isEmpty(authCode)) {
      return CommonResult.failed("请输入验证码");
    }
    String realAuthCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
    if (authCode.equals(realAuthCode)) {
      return CommonResult.success("验证码校验成功");
    } else {
      return CommonResult.failed("验证码校验失败");
    }
  }
}
