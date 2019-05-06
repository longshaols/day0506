package com.bdqn.day0506.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.bdqn.day0506.entity.Goods;

public interface GoodsMapper {
    int deleteByPrimaryKey(int id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> findAll();


}