package com.capg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bluelotus")  //api/v1
public class ProductController {
	
	@GetMapping("/home")
	public String home() {
		return "this is home";
	}
	
	@GetMapping("/aboutUs")
	public String aboutUs() {
		return "this is about modified";
	}

}

