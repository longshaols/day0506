package com.bdqn.day0506.service.impl;

import com.bdqn.day0506.dao.GoodsMapper;
import com.bdqn.day0506.entity.Goods;
import com.bdqn.day0506.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> selectAll() {
        return goodsMapper.findAll();
    }

    @Override
    public int insertOne(Goods goods) {
        return goodsMapper.insertSelective(goods);
    }

    @Override
    public int delOne(int id) {
        return goodsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Goods getOne(int id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateOne(Goods goods) {
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }
}
