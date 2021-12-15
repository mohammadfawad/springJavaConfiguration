package com.springframework.springJavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyService {

	@Autowired
	private DummyDAO dummyDAO;
	
	public void init() {
		System.out.print("\ninit()\n");
	}
	
	public void destroy() {
		System.out.print("\ndestroy()\n");
	}
	
	public void serviceDummyDAO() {
		dummyDAO.createDummyDAO();
	}
}
