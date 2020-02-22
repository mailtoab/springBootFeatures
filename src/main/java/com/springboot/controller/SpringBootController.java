package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exception.SpringBootException;
import com.springboot.model.SpringBootModel;
import com.springboot.service.SpringBootService;


@RestController
@RequestMapping("/springboot/feature")
public class SpringBootController {

	/* 
	 * Interface need not to be annotated with @Service/@Repository.
	 * Spring
	 * 
	*/ 
	@Autowired
	private SpringBootService springBootService; 
	
	@Value("${mySetting.value}")
	private String mySetting;

	@GetMapping("/testGet") // Method name and mapping url need not to be similar
	public String testGet() {
		springBootService.display();
		return mySetting;
	}

	@GetMapping("/testGetWithParam/{id}")
	public String testGetWithParam(@PathVariable("id") final String userId) {
		return "success: " + userId;
	}
	
	@PostMapping("/testPost")
	public SpringBootModel testPost(SpringBootModel springBootModel) {
		springBootModel.setName("Name changed");
		return springBootModel;
	}
	
	@GetMapping("/testException/{i}")
	public String testException(@PathVariable("i") int i) {
		if(i==1)
			throw new SpringBootException("Exception thrown");
		return "sdfsd";
	}

}
