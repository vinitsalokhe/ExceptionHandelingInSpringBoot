package com.pro.demo.exception;

import org.springframework.http.HttpStatus;

public class StudentNotFoundException extends RuntimeException{

	String massage;
	
	public StudentNotFoundException(String massage, HttpStatus notFound) {
		super(massage);
		this.massage=massage;
	}
	
}
