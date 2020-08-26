package com.example.mall.service;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * @Classname DynamicSecurityService
 * @Description 动态权限相关业务类
 * @Date 2020/8/26 14:22
 * @Created by v_geeliu
 */
public interface DynamicSecurityService {
    /**
     * 加载资源ANT通配符和资源对应MAP
     */
    Map<String, ConfigAttribute> loadDataSource();
}
