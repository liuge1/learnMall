package com.example.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MyBatisConfig
 * @Description MyBatis配置类
 * @Date 2020/8/18 17:18
 * @Created by v_geeliu
 */

@Configuration
@MapperScan("com.example.mall.mbg.mapper")
public class MyBatisConfig {

}
