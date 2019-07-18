package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.service.DoTestService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @date 2019年6月5日
 * @author lihui
 */
@RestController
@Slf4j
public class HController {

	@Autowired
	private DoTestService doTestService;

	/**
	 * http://localhost/h?n=http://t.erp.95081.com/img/img/2019/07/03/c3adb481752546acb257821a298e9139.jpg
	 * 
	 * @param n
	 * @return
	 */
	@RequestMapping("/h")
	public String sayHey(String n) {
		log.info("---消费者请求参数：[{}]", n);
		String s = this.doTestService.sayHey(n);
		log.info("---消费者结果：[{}]", s);
		return s;
	}

}
