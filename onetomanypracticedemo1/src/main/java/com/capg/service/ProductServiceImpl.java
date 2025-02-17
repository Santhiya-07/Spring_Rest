package com.capg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Product;
import com.capg.exception.IdNotFoundException;
import com.capg.exception.InvalidPriceException;
import com.capg.repository.ProductRepository;

@Service //or @Component
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository productRepository;
	

	@Override
	public Product addProduct(Product product) throws InvalidPriceException  {
		if(product.getPrice()<=0) {
			throw new InvalidPriceException("price cannot be negative");
		}
		
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(int id) throws IdNotFoundException {
		Optional<Product> product=productRepository.findById(id);
		if(product.isEmpty()) {
			throw new IdNotFoundException("no id present");
		}
		
		
		return product.get();
	}

	@Override
	public String deleteProductById(int id) throws IdNotFoundException {
		if(!productRepository.existsById(id)) {
			throw new IdNotFoundException("no product id found");
		}
		
		productRepository.deleteById(id);
		return "successfully deleted";
	}

	@Override
	public Product updateProductById(int id, Product product) throws IdNotFoundException {
		Product pro=productRepository.findById(id)
				                     .orElseThrow(()-> new IdNotFoundException("no id founded"));
		
		pro.setName(product.getName());
		pro.setPrice(product.getPrice());
		pro.setCategory(product.getCategory());
		return productRepository.save(pro);
	}

	@Override
	public Product getProductByName(String name) {
		
		return productRepository.findByName(name);
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		
		return productRepository.findByCategory(category);
	}
	
	

	
	

	
	

}
