package org.gdin.mapper;

import org.apache.ibatis.annotations.Param;
import org.gdin.entity.SuccessKilled;



public interface SuccessKilledDao {
	int insertSuccessKilled(@Param("seckillId")long seckillId,@Param("userPhone")long userPhone);
	SuccessKilled queryByIdWithSeckill(@Param("seckillId")long seckillId,@Param("userPhone")long userPhone);
	SuccessKilled test1(@Param("seckillId")long seckillId,@Param("userPhone")long userPhone);
}
