package org.gdin.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.gdin.entity.Seckill;


public interface SeckillDao {
	
	int reduceNumber(@Param("seckillId")long seckillId,@Param("killTime")Date killTime);
	Seckill queryById(long seckillId);
	List<Seckill> queryAll(@Param("offset")int offet,@Param("limit")int limit);
	Seckill test1(Seckill seckill);
	Seckill test2(long seckillId);
}
