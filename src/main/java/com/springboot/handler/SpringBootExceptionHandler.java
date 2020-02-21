package com.springboot.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SpringBootExceptionHandler {

	@ExceptionHandler
	public String handleException(Exception exception) {
		return exception.getMessage();
	}
}
