package com.springboot.dao;

import org.springframework.stereotype.Repository;

@Repository
public class SpringBootDaoImpl implements SpringBootDao {

	@Override
	public void display() {
		System.out.println("I am in SpringBootDaoImpl.display()");		
	}

}
