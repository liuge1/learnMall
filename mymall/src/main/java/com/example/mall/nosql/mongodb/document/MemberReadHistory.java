package com.example.mall.nosql.mongodb.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @Classname MemberReadHistory
 * @Description 用户商品浏览历史记录
 * @Date 2020/8/20 17:06
 * @Created by v_geeliu
 *
 * @Document:标示映射到Mongodb文档上的领域对象
 * @Id:标示某个域为ID域
 * @Indexed:标示某个字段为Mongodb的索引字段
 */
@Document
@Data
public class MemberReadHistory {
    @Id
    private String id;
    @Indexed
    private Long memberId;
    private String memberNickname;
    private String memberIcon;
    @Indexed
    private Long productId;
    private String productName;
    private String productPic;
    private String productSubTitle;
    private String productPrice;
    private Date createTime;
}
