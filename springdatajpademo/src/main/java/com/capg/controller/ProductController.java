package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capg.entity.Product;
import com.capg.repository.ProductRepository;


@RestController
@RequestMapping("api/v1") 
public class ProductController {
	@Autowired
	ProductRepository productRepository;
	
	@PostMapping("/product")
	public Product  addProduct(@RequestBody Product product) {
		return productRepository.save(product);
		
	}
	
	@GetMapping("/product")
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id){
		return productRepository.findById(id).get();
	}
	@DeleteMapping("/product/{id}")
	public String deleteProductById(@PathVariable int id) {
		if(!productRepository.existsById(id)) {
			return "no product";
		}
		productRepository.deleteById(id);
		
		return "success";
	}

}
