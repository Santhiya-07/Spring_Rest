package com.capg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.capg.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{ 
	//using query method
	//List<Product> findByCategory(String category);
	Product findByName(String name);
	
	//jpql
	@Query("select p from Product p where p.category=:category")
	List<Product> findByCategory(@Param("category") String category);
	
	@Query("select p from product p where p.price>:price")
	List<Product> findByPriceGreaterThan();
	

}
