package com.capg.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
	//select * from Employee where name="".
	Employee findByName(String name);
	
	List<Employee> findByDept(String dept);
	
	Employee findByNameAndAge(String name,int age);
	
	Integer countByDept(String dept);
	
	

}
