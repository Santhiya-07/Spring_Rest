package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//Provide necessary Annotation wherever necessary
@Data
@Setter
@Getter
@AllArgsConstructor
@ToString

@Entity
public class Module {
	
   // Provide necessary Annotation
	@Id
	
   private String moduleId;
	@NotEmpty(message = "Module name cannot be empty")
   private String moduleName;
	@Min(value=1, message = "Module fee should be greater than zero")
   private double moduleFee;
	@Min(value=1, message = "Duration should be at least 1 month")
   private int duration;
	@NotEmpty(message = "Difficulty level cannot be empty")
   private String difficultyLevel;

   public Module()
   {
     super();
   }

 }
