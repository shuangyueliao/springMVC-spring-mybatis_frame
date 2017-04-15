package org.gdin.service;

import java.util.List;

import org.gdin.entity.Seckill;

public interface SeckillService {
	List<Seckill>getSeckillList();
	Seckill getById(long seckillId);
	void reduceNumber(long seckillId);
}
