package com.example.mall.dto;

import com.example.mall.mbg.model.SmsFlashPromotionSession;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Classname SmsFlashPromotionSessionDetail
 * @Description 包含商品数量的场次信息
 * @Date 2020/8/31 16:57
 * @Created by v_geeliu
 */
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {
    @Setter
    @Getter
    @ApiModelProperty("商品数量")
    private Long productCount;
}
