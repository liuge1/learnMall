package com.example.mall.dto;

import com.example.mall.mbg.model.UmsMenu;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Classname UmsMenuNode
 * @Description  后台菜单节点封装
 * @Date 2020/8/25 16:03
 * @Created by v_geeliu
 */
@Data
public class UmsMenuNode  extends UmsMenu{
    @ApiModelProperty(value = "子级菜单")
    private List<UmsMenuNode> children;
}
