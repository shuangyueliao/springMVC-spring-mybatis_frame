package org.gdin.service.impl;

import java.util.Date;
import java.util.List;

import org.gdin.entity.Seckill;
import org.gdin.mapper.SeckillDao;
import org.gdin.mapper.SuccessKilledDao;
import org.gdin.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class SeckillServiceImpl implements SeckillService{
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SeckillDao seckillDao;
	@Autowired
	private SuccessKilledDao successKilledDao;
	public List<Seckill> getSeckillList() {
		// TODO Auto-generated method stub
		return seckillDao.queryAll(0, 4);
	}

	public Seckill getById(long seckillId) {
		// TODO Auto-generated method stub
		return seckillDao.queryById(seckillId);
	}

	@Override
	public void reduceNumber(long seckillId) {
		Date killTime=new Date();
		int x=0;
		x=seckillDao.reduceNumber(seckillId, killTime);
		System.out.println(" ‹”∞œÏ––"+x);
		
	}
}
