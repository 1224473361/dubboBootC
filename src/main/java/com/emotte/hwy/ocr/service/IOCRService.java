package com.emotte.hwy.ocr.service;

/**
 * @Description: 文字识别OCR
 * @author wyx
 * @date 2019年7月3日
 */
public interface IOCRService {

	/**
	 * @Description: 身份证识别
	 * @param imgURL
	 * @return String
	 * @author wyx
	 * @date 2019年7月4日
	 */
	public String idCardOCR(String imgURL);
}
