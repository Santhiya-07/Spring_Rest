package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Product;
import com.capg.exception.IdNotFoundException;
import com.capg.exception.InvalidPriceException;
import com.capg.service.ProductService;

@RestController
@RequestMapping("api/v2")
public class ProductController2 {
	@Autowired
	ProductService productService;
	public ResponseEntity<Product> addProduct(@RequestBody Product product) throws InvalidPriceException{
		return new ResponseEntity<Product>(productService.addProduct(product), HttpStatus.OK);
		
	}
	public ResponseEntity<List<Product>> getAllProduct(){
		return new ResponseEntity<List<Product>>(productService.getAllProduct(), HttpStatus.OK);
		
	}
	public ResponseEntity<Product> getProductById(@PathVariable int id) throws IdNotFoundException{
		return new ResponseEntity<Product>(productService.getProductById(id), HttpStatus.OK);
	}
	public ResponseEntity<String> deleteProductById(@PathVariable int id) throws IdNotFoundException{
		return new ResponseEntity<String>(productService.deleteProductById(id), HttpStatus.OK);
	}
	
	public ResponseEntity<Product> updateProductById(@PathVariable int id,@RequestBody Product product) throws IdNotFoundException{
		return new ResponseEntity<Product>(productService.updateProductById(id,product), HttpStatus.OK);
	}
	

}
