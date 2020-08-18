package com.example.mall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Classname Swagger2Config
 * @Description swagger2API 文档的配置
 * @Date 2020/8/18 19:44
 * @Created by v_geeliu
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

  @Bean
  public Docket createRestApi(){
    return new Docket(DocumentationType.SWAGGER_2).
        apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.example.mall.controller"))
        .paths(PathSelectors.any())
        .build();
  }

  private ApiInfo apiInfo(){
    return new ApiInfoBuilder()
        .title("mall开发文档")
        .description("mall开发文档")
        .contact("macro")
        .version("1.0")
        .build();
  }
}
