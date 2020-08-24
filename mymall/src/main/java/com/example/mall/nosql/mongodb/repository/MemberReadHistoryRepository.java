//package com.example.mall.nosql.mongodb.repository;
//
//import com.example.mall.nosql.mongodb.document.MemberReadHistory;
//import org.springframework.data.mongodb.repository.MongoRepository;
//
//import java.util.List;
//
///**
// * @Classname MemberReadHistoryRepository
// * @Description 会员商品浏览历史Repository
// * @Date 2020/8/20 17:05
// * @Created by v_geeliu
// */
//public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String> {
//
//    /**
//     * 根据会员id按时间倒序获取浏览记录
//     * @param memberId 会员id
//     */
//    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
//}
