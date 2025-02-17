package com.capg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString*/

@Data
@Entity
@Table(name="pro4")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty(message="name cannot be empty")
	@Size(min=3,max=10,message="name length can be between 3 to 10 character")
	private String name;
	
	@Min(value=1, message="price should be minimum 1")
	private double price;
	
	@NotEmpty(message="category cannot be empty")
	private String category;
	
	
	
	
	
	

}
