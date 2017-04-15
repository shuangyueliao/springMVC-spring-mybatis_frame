package org.gdin.test;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.gdin.entity.Seckill;
import org.gdin.mapper.SeckillDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml"})
public class SeckillDaoTest {
	@Resource
	private SeckillDao seckillDao;
	
	
	@Test
	public void a(){
		long id=1000;
		Seckill seckill=seckillDao.queryById(id);
		System.out.println(seckill);
	}
	@Test
	public void b(){
		List<Seckill>seckills=seckillDao.queryAll(0, 2);
		for(Seckill seckill:seckills){
			System.out.println(seckill);
		}
	}
	@Test
	public void c(){
		Date killTime=new Date();
		int updateCount=seckillDao.reduceNumber(1000L, killTime);
		System.out.println("updateCount:"+updateCount);
	}
	@Test
	public void d(){
		Seckill seckill1=new Seckill();
		seckill1.setSeckillId(1003L);
		Seckill seckill=seckillDao.test1(seckill1);
		System.out.println(seckill);
	}
	@Test
	public void e(){
		Seckill seckill=seckillDao.test2(1000);
		System.out.println(seckill);
	}
	
}
