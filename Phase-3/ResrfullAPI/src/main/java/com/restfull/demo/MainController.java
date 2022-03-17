package com.restfull.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

	@GetMapping("/")
	public String getUsers()
	{
		RestTemplate template=new RestTemplate();
	    User user=template.getForObject("https://jsonplaceholder.typicode.com/users/1", User.class);
	    
	    return user.toString();
	}
}
