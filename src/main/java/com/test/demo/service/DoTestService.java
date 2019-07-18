package com.test.demo.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.emotte.hwy.ocr.service.IOCRService;

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
	private IOCRService cardService;

	public String sayHey(String n) {
		log.info("接口是否有值:{}", null != this.cardService);
		return this.cardService.idCardOCR(n);
	}

}
