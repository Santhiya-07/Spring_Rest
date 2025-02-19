package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Customer;
import com.capg.repository.CustomerRepository;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
	@Autowired
	CustomerRepository customerRepository;
	
	@PostMapping("/details")
	public Customer addDetails(@RequestBody Customer details) {
		return customerRepository.save(details);
		
	}
	
	@GetMapping("/details")
	public List<Customer> getDetails(){
		return customerRepository.findAll();
	}
	
	@GetMapping("/details/{id}")
	public Customer getDetailsById(@PathVariable int id) {
		return customerRepository.findById(id).get();
	}
	
	

}
