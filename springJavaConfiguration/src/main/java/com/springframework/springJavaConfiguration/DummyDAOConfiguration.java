package com.springframework.springJavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DummyDAOConfiguration {

	@Bean
	public DummyDAO returnBeanDummyDAO() {
		return new DummyDAO();
	}
}
