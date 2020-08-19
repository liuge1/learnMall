package com.example.mall.common;

import com.github.pagehelper.PageInfo;
import java.util.List;
import lombok.Data;

/**
 * @Classname CommonPage
 * @Description 分页封装数据
 * @Date 2020/8/18 17:44
 * @Created by v_geeliu
 */
@Data
public class CommonPage<T> {

  private Integer pageNum;
  private Integer pageSize;
  private Integer totalPage;
  private Long total;
  private List<T> list;

  /**
   * 将PageHelper分页后的list转为分页信息
   */
  public static <T> CommonPage<T> restPage(List<T> list) {
    CommonPage<T> result = new CommonPage<T>();
    PageInfo<T> pageInfo = new PageInfo<T>(list);
    result.setTotalPage(pageInfo.getPages());
    result.setPageNum(pageInfo.getPageNum());
    result.setPageSize(pageInfo.getPageSize());
    result.setTotal(pageInfo.getTotal());
    result.setList(pageInfo.getList());
    return result;
  }

}