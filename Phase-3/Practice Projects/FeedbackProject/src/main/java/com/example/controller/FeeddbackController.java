package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Feedback;
import com.example.repo.Feedbackrepo;

@RestController

public class FeeddbackController {
	
	@Autowired
	Feedbackrepo feedbackrepo;
	
	@PostMapping("/feedback")
	public ResponseEntity<Feedback> addfeedback(@RequestBody Feedback feedback)
	{
		int x=feedbackrepo.save(feedback);
		if(x>0)
			return new ResponseEntity<Feedback>(feedback,HttpStatus.CREATED);
		else
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("/list")
	public String listProducts(ModelMap map)
	{
		List<Feedback> list=feedbackrepo.getProducts();
		map.addAttribute("list",list);
		return "listproducts";
	}

}
