package com.capg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
