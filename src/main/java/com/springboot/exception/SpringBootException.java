package com.springboot.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class SpringBootException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private @Getter @Setter String message;

}
