package com.bdqn.day0506.service;

import com.bdqn.day0506.entity.Goods;

import java.util.List;

public interface IndexService {
    List<Goods> selectAll();

    int insertOne(Goods goods);

    int delOne(int id);

    Goods getOne(int id);

    int updateOne(Goods goods);
}
