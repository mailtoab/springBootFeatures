package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*@SpringBootApplication
public class SpringBootFeaturesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeaturesApplication.class, args);
	}

}*/

// To deploy spring boot application as war into tomcat
// Update the @SpringBootApplication class to extend SpringBootServletInitializer, and override the configure method.
@SpringBootApplication
public class SpringBootFeaturesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeaturesApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootFeaturesApplication.class);
	}

}