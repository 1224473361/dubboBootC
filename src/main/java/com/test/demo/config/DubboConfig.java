package com.test.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.RegistryConfig;

/**
 * 
 * @date 2019年7月4日
 * @author lihui
 */
@Configuration
public class DubboConfig {

	@Bean
	@ConfigurationProperties(prefix = "spring.dubbo.registry")
	public RegistryConfig registryConfig() {
		return new RegistryConfig();
	}
}
