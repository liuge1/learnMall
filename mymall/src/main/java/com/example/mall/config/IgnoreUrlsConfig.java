package com.example.mall.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname IgnoreUrlsConfig
 * @Description TODO
 * @Date 2020/8/26 11:48
 * @Created by v_geeliu
 */
@Data
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrlsConfig {

    private List<String> urls = new ArrayList<>();

}
