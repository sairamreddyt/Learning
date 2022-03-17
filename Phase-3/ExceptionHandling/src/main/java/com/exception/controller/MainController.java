package com.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exception.custom.ProductNotFoundException;

@RestController
public class MainController {

	@GetMapping(value="/test")
	public String test()
	{
		return "Hello Sai";
	}
	
	@GetMapping(value="/testproducts/{id}")
	public String getproduct(@PathVariable("id")String id)
	{
		if(id.contentEquals("0"))
		{
			throw new ProductNotFoundException();
		}
		else
		{
			return "Product Found";
		}
	}
}
