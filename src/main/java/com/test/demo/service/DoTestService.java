package com.test.demo.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @date 2019年6月5日
 * @author lihui
 */
@Service
@Slf4j
public class DoTestService {

	@Reference
	private DemoService demoService;

	public String sayHey(String n) {
		log.info("接口是否有值:{}", null != this.demoService);
		return this.demoService.sayHello(n);
	}

}
