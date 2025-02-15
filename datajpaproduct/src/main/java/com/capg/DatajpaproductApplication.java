package com.capg;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capg.entity.Product;
import com.capg.repo.ProductRepo;

@SpringBootApplication
public class DatajpaproductApplication implements CommandLineRunner {
	@Autowired
	ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(DatajpaproductApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * List<Product>pro=new ArrayList<Product>(); pro.add(new
		 * Product("soap",80.00,2)); pro.add(new Product("powder",66.00,3)); pro.add(new
		 * Product("biscuit",50.90,7)); pro.add(new Product("chocolate",100.00,10));
		 * 
		 * productRepo.saveAll(pro);
		 * System.out.println("inserted collections of products");
		 */
		
		System.out.println("---find All Product---");
		List<Product>pro=productRepo.findAll();
		pro.forEach(System.out::println);
		
		Optional<Product>p=productRepo.findById(2);
		if(p.isPresent()) {
			System.out.println(p.get());
		}
		else {
			System.out.println("not present");
		}
		
	}

}
