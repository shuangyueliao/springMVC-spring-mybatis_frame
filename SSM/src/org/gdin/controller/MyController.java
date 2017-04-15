package org.gdin.controller;

import java.util.List;

import org.gdin.entity.Seckill;
import org.gdin.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@Autowired
	private SeckillService seckillService;

	
	@RequestMapping(value = "/list", method = RequestMethod.GET,produces = "application/json; charset=utf-8")
	@ResponseBody
	public String list() {
		List<Seckill> list = seckillService.getSeckillList();
		System.out.println(list);
		return "\"success\":"+list;
	}
	@RequestMapping("/hello")
	public String hello(){
		return "success";
	}

}
