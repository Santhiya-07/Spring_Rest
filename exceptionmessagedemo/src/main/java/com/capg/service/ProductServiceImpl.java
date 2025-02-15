package com.capg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Product;
import com.capg.exception.IdNotFoundException;
import com.capg.exception.InvalidPriceException;
import com.capg.repository.ProductRepository;
import com.capg.util.AppConstant;

@Service //or @Component
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository productRepository;
	

	@Override
	public Product addProduct(Product product) throws InvalidPriceException  {
		if(product.getPrice()<=0) {
			throw new InvalidPriceException(AppConstant.INVALID_PRICE_MSG);
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
			throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MSG);
		}
		
		
		return product.get();
	}

	@Override
	public String deleteProductById(int id) throws IdNotFoundException {
		if(!productRepository.existsById(id)) {
			throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MSG);
		}
		
		productRepository.deleteById(id);
		return "successfully deleted";
	}

	@Override
	public Product updateProductById(int id, Product product) throws IdNotFoundException {
		Product pro=productRepository.findById(id)
				                     .orElseThrow(()-> new IdNotFoundException(AppConstant.ID_NOT_FOUND_MSG));
		
		pro.setName(product.getName());
		pro.setPrice(product.getPrice());
		pro.setCategory(product.getCategory());
		return productRepository.save(pro);
	}

	
	

	
	

}
