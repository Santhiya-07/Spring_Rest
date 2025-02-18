package com.capg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class HelloWorldController {
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home any one can access without login";
	}
	
	
	@GetMapping("/admin/addproduct")
	public String adminUser()
	{
		return "only admin can access this, to add the product";
	}
	
	@GetMapping("/admin/editproduct")
	public String adminUser2()
	{
		return "only admin can access this, to edit the product";
	}
	
	@GetMapping("/user/viewproduct")
	public String customer()
	{
		return "only user can access this api";
	}
	
	
	@GetMapping("/contact")
	public String contact()
	{
		return "both can access";
	}
	

}
