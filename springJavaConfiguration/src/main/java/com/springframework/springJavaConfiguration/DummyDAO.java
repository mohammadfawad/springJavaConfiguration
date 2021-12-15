package com.springframework.springJavaConfiguration;

import org.springframework.stereotype.Component;

@Component
public class DummyDAO {

	public void createDummyDAO() {
		System.out.print("@DummyDAO DataBase Connection Created\n");
	}
}
