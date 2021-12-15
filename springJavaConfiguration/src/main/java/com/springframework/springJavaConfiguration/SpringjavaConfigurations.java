package com.springframework.springJavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(DummyDAOConfiguration.class)
public class SpringjavaConfigurations {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Scope("prototype")
	public DummyService returnDummyService() {
		return new DummyService();
	}
}
