package com.example.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Classname OmsReturnApplyQueryParam
 * @Description TODO
 * @Date 2020/8/28 16:39
 * @Created by v_geeliu
 */
@Data
public class OmsReturnApplyQueryParam {
    @ApiModelProperty("服务单号")
    private Long id;
    @ApiModelProperty(value = "收货人姓名/号码")
    private String receiverKeyword;
    @ApiModelProperty(value = "申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝")
    private Integer status;
    @ApiModelProperty(value = "申请时间")
    private String createTime;
    @ApiModelProperty(value = "处理人员")
    private String handleMan;
    @ApiModelProperty(value = "处理时间")
    private String handleTime;
}
