package com.bdqn.day0506.controller;

import com.bdqn.day0506.common.utils.JsonUtil;
import com.bdqn.day0506.entity.Goods;
import com.bdqn.day0506.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    private IndexService indexService;
    @PostMapping("selectAll")
    private String selectAll(){
        List<Goods> goodsList = indexService.selectAll();
        if (goodsList != null){
            return JsonUtil.getResponseJson(0,"ok",goodsList);
        }
        return JsonUtil.getResponseJson(1,"error",null);
    }

    @PostMapping("insertOne")
    private String insertOne(Goods goods){
        int row = indexService.insertOne(goods);
        if (row != 0){
            return JsonUtil.getResponseJson(0,"ok",null);
        }
        return JsonUtil.getResponseJson(1,"error",null);
    }
    @PostMapping("delOne")
    private String delOne(int id){
        int row = indexService.delOne(id);
        if (row != 0){
            return JsonUtil.getResponseJson(0,"ok",null);
        }
        return JsonUtil.getResponseJson(1,"error",null);
    }

    @PostMapping("getOne")
    private String getOne(int id){
        Goods goods = indexService.getOne(id);
        if (goods != null){
            return JsonUtil.getResponseJson(0,"ok",goods);
        }
        return JsonUtil.getResponseJson(1,"error",null);
    }
    @PostMapping("updateOne")
    private String updateOne(Goods goods){
        int row = indexService.updateOne(goods);
        if (row != 0){
            return JsonUtil.getResponseJson(0,"ok",null);
        }
        return JsonUtil.getResponseJson(1,"error",null);
    }
}
