package org.gdin.test;

import javax.annotation.Resource;

import org.gdin.entity.SuccessKilled;
import org.gdin.mapper.SuccessKilledDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml"})
public class SuccessKilledTest {
	@Resource
	private SuccessKilledDao successKilledDao;
	
	
	@Test
	public void a(){
		long id=1000L;
		long phone=110;
		int insertCount=successKilledDao.insertSuccessKilled(id, phone);
		System.out.println("insertCount="+insertCount);
	}
	@Test
	public void b(){
		long id=1000L;
		long phone=223523512351L;
		SuccessKilled successKilled=successKilledDao.queryByIdWithSeckill(id, phone);
		System.out.println(successKilled);
	}
	@Test
	public void c(){
		long id=1000L;
		long phone=223523512351L;
		SuccessKilled successKilled=successKilledDao.test1(id, phone);
		System.out.println(successKilled);
	}
}
//SuccessKilled [seckillId=1000, userPhone=223523512351, state=9, 
//createTime=Sat Apr 15 19:52:05 CST 2017, 
//seckill=Seckill [seckillId=1000, name=100ÔªÃëÉ±iphone6, number=97, 
//startTime=Thu Jan 01 00:00:00 CST 2015, endTime=Fri Apr 28 00:00:00 CST 2017,
//createTime=Sat Apr 01 14:52:29 CST 2017]]
