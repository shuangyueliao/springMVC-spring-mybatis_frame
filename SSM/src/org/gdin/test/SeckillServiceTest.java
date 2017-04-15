package org.gdin.test;

import java.util.List;

import org.gdin.entity.Seckill;
import org.gdin.service.SeckillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"classpath:spring/applicationContext.xml"})
public class SeckillServiceTest {
	@Autowired
	private SeckillService seckillService;
	@Test
	public void a(){
		List<Seckill>list=seckillService.getSeckillList();
		for(Seckill sckill:list){
			System.out.println(sckill);
		}
		
	}
	@Test
	public void b(){
		long id=1000;
		Seckill seckill=seckillService.getById(id);	
		System.out.println(seckill);
	}
	@Test
	public void c(){
		long id=1003;
		seckillService.reduceNumber(id);
	}
}
