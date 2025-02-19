package com.capg.service;

import java.util.List;

import com.capg.entity.Product;
import com.capg.exception.IdNotFoundException;
import com.capg.exception.InvalidPriceException;

public interface ProductService {
	Product addProduct(Product product) throws InvalidPriceException;
	List<Product> getAllProduct();
	
	
	Product updateProductById(int id, Product product) throws  IdNotFoundException;
	Product getProductById(int id) throws IdNotFoundException;
	String deleteProductById(int id) throws IdNotFoundException;
	

}
