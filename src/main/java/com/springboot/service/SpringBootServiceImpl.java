package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.SpringBootDao;

@Service 
public class SpringBootServiceImpl implements SpringBootService {
	
	@Autowired
	private SpringBootDao springBootDao;

	@Override
	public void display() {
		System.out.println("I am in SpringBootServiceImpl.display()");		
		springBootDao.display();
	}

}
