package com.liang.dao;

import com.liang.entity.Seckill;

import java.util.Date;
import java.util.List;

public interface SeckillDao {
    //减库存操作 返回结果为更新影响条数
    int reduceNumber(long seckillId, Date killTime);

    Seckill queryById(long seckillId);

    List<Seckill> queryAll(int offset, int limit);


}
