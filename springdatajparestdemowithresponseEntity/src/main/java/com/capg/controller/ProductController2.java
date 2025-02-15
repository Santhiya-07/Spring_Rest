package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Product;
import com.capg.exception.IdNotFoundException;
import com.capg.exception.InvalidPriceException;
import com.capg.service.ProductService;

import jakarta.validation.Valid;
@Validated
@RestController
@RequestMapping("api/v2")
public class ProductController2 {
	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product) throws InvalidPriceException{
		return new ResponseEntity<Product>(productService.addProduct(product), HttpStatus.OK);
		
	}
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAllProduct(){
		return new ResponseEntity<List<Product>>(productService.getAllProduct(), HttpStatus.OK);
		
	}
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id) throws IdNotFoundException{
		return new ResponseEntity<Product>(productService.getProductById(id), HttpStatus.OK);
	}
	@DeleteMapping("/product/{id}")
	public ResponseEntity<String> deleteProductById(@PathVariable int id) throws IdNotFoundException{
		return new ResponseEntity<String>(productService.deleteProductById(id), HttpStatus.OK);
	}
	@PutMapping("/product/{id}")
	public ResponseEntity<Product> updateProductById(@PathVariable int id,@RequestBody Product product) throws IdNotFoundException{
		return new ResponseEntity<Product>(productService.updateProductById(id,product), HttpStatus.OK);
	}
	
	public ResponseEntity<Product> getProductByName(@PathVariable String name){
		return new ResponseEntity<Product>(productService.getProductByName(name),HttpStatus.OK);
	}
	

}
