package com.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

//Provide necessary Annotation 
@Entity
public class Membership {

	//Provide necessary Annotation 
	@Id
	@NotEmpty(message= "Provide value for membership Id")
	private String membershipId;
	@NotEmpty(message="Provide value for plan name")
	private String planName;
	@NotEmpty(message="Provide value for membership type")
	private String membershipType;
	@Min(value=30,message="Monthly Access Hours should be in the range 30 to 90")
	@Max(value=90,message = "Monthly Access Hours should be in the range 30 to 90")
	private int monthlyAccessHours;
	@PastOrPresent(message="Launch date should be either current or past date")
	private LocalDate launchDate;
	@Future(message="Expiration date should be in future")
	private LocalDate expirationDate;
	@Positive(message="Monthly fee should be greater than zero")
	private double monthlyFee;
	@NotEmpty(message="Provide value for benefits")
	private String benefits;
	private boolean dietPlanOpted;

	public Membership() {
		super();
	}

	public Membership(String membershipId, String planName, String membershipType, int monthlyAccessHours,
			LocalDate launchDate, LocalDate expirationDate, double monthlyFee, String benefits, boolean dietPlanOpted) {
		
		this.membershipId = membershipId;
		this.planName = planName;
		this.membershipType = membershipType;
		this.monthlyAccessHours = monthlyAccessHours;
		this.launchDate = launchDate;
		this.expirationDate = expirationDate;
		this.monthlyFee = monthlyFee;
		this.benefits = benefits;
		this.dietPlanOpted = dietPlanOpted;
	}



	public String getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	public int getMonthlyAccessHours() {
		return monthlyAccessHours;
	}

	public void setMonthlyAccessHours(int monthlyAccessHours) {
		this.monthlyAccessHours = monthlyAccessHours;
	}

	public LocalDate getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(LocalDate launchDate) {
		this.launchDate = launchDate;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public boolean isDietPlanOpted() {
		return dietPlanOpted;
	}

	public void setDietPlanOpted(boolean dietPlanOpted) {
		this.dietPlanOpted = dietPlanOpted;
	}
}
