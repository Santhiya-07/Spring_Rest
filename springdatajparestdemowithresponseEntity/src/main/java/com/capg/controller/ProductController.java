package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
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

@RestController
@RequestMapping("api/v1")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) throws InvalidPriceException {
		return productService.addProduct(product);
	}
	@GetMapping("/product")
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
	}
	/*
	 * @ExceptionHandler(value=InvalidPriceException.class) public String
	 * handleInvalidPrice(InvalidPriceException e) { return e.getMsg(); }
	 */
	
	/*
	 * @ExceptionHandler(value=InvalidPriceException.class) public String
	 * handleError() { return "enter valid price"; }
	 */
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) throws IdNotFoundException{
		return productService.getProductById(id);
		
	}
	
	@DeleteMapping("/product/{id}")
	public String deleteProductById(@PathVariable int  id) throws IdNotFoundException{
		return productService.deleteProductById(id);
	}
	
	@PutMapping("/product/{id}")
	public Product updateProductById(@PathVariable int id,@RequestBody Product product) throws IdNotFoundException{
		return productService.updateProductById(id, product);
	}
	
	@ExceptionHandler(value=InvalidPriceException.class) 
	public String handleExceptionForInvalidPrice(InvalidPriceException e) { 
		return e.getMsg(); 
		}
	
	@ExceptionHandler(value=IdNotFoundException.class) 
	public String handleExceptionForIdNotFound(IdNotFoundException e) { 
		return e.getMsg(); 
		}
	

}
