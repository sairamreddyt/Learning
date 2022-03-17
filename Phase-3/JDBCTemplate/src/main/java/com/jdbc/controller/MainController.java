package com.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.jdbc.dao.EProductDAO;
import com.jdbc.entity.EProduct;

@Controller
public class MainController {

	@Autowired
	EProductDAO eproductDAO;
	
	@GetMapping("/list")
	public String listProducts(ModelMap map)
	{
		List<EProduct> list=eproductDAO.getProducts();
		map.addAttribute("list",list);
		return "listproducts";
	}
}