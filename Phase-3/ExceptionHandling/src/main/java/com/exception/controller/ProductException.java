package com.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.exception.custom.ProductNotFoundException;
//Total Class
@ControllerAdvice
public class ProductException {
	//only on exception
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<Object> exception(ProductNotFoundException e)
	{
		return new ResponseEntity<Object>("Product Not Found",HttpStatus.NOT_FOUND);
	}

}
