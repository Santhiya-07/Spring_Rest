package com.capg;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capg.entity.Employee;
import com.capg.repo.EmployeeRepo;

@SpringBootApplication
public class Datajpa1Application implements CommandLineRunner  {
	@Autowired
	EmployeeRepo employeeRepo;

	public static void main(String[] args) {
		SpringApplication.run(Datajpa1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Employee emp=new Employee("Rahul","hr",24,89000.90);
		 * 
		 * 
		 * employeeRepo.save(emp); System.out.println("inserted one row");
		 * 
		 * List<Employee> employee=new ArrayList<Employee>(); employee.add(new
		 * Employee("mohit","tester",34,23000.09)); employee.add(new
		 * Employee("sandy","hr",45,56090.00)); employee.add(new
		 * Employee("jai","developer",22,77000.00));
		 * 
		 * employeeRepo.saveAll(employee);
		 * System.out.println("inserted collection of employees");
		 */
		
		/*
		 * Optional<Employee> emp= employeeRepo.findById(1); if(emp.isPresent()) {
		 * System.out.println(emp.get()); } else { System.out.println("present"); }
		 * System.out.println("--findAllEmployee--"); List<Employee>
		 * employee=employeeRepo.findAll(); employee.forEach(System.out::println);
		 * 
		 * System.out.println(); System.out.println("---------"); Employee
		 * emp1=employeeRepo.findByName("Rahul"); System.out.println(emp1);
		 * 
		 * System.out.println(); List<Employee>emp2=employeeRepo.findByDept("hr");
		 * emp2.forEach(System.out::println);
		 */
		
		/*
		 * Employee emp3=employeeRepo.findByNameAndAge("sandy", 45);
		 * System.out.println(emp3);
		 */
		
		 Integer emp4=employeeRepo.countByDept("hr");
		 System.out.println(emp4);
	}
	
	

}
