package com.springframework.springJavaConfiguration;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaConfigurationsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringjavaConfigurations.class);
		DummyService dummyService = context.getBean(DummyService.class);
		dummyService.serviceDummyDAO();
		DummyService dummyService1 = context.getBean(DummyService.class);
		dummyService1.serviceDummyDAO();
		
		System.out.print(dummyService + "\n" + dummyService1);
		
		context.close();
	}

}
