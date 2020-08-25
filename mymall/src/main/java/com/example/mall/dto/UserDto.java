package com.example.mall.dto;

import lombok.Data;

import java.util.List;

/**
 * @Classname UserDto
 * @Description 登录用户信息
 * @Date 2020/8/24 20:37
 * @Created by v_geeliu
 */
@Data
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private Integer status;
    private String clientId;
    private List<String> roles;
}
