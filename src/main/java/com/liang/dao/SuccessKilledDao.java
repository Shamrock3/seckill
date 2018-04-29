package com.liang.dao;

import com.liang.entity.SuccessKilled;

public interface SuccessKilledDao {

    int insertSuccessKilled(long seckillId,long userPhone);


    SuccessKilled queryByIdWithSeckill(long seckillId, long userPhone);



}
