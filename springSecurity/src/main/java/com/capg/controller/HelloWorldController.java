package com.capg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class HelloWorldController {
	@GetMapping("/home")
	public String home() {
		return "this is home";
	}

}
