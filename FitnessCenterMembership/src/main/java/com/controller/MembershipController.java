package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.exception.InvalidMembershipException;
import com.model.Membership;
import com.service.IMembershipService;

//Provide necessary Annotation
@RestController
public class MembershipController {
	
	//Provide necessary Annotation
	@Autowired
	private IMembershipService membershipService;
	
	//Provide necessary Annotation for the below methods and fill the code
	
	public ResponseEntity<Membership> addMembership(Membership membership) {
		return null;
	}	 	  	      	 	    	      	    	      	 	

	public ResponseEntity<Membership> viewMembershipById(String membershipId) throws InvalidMembershipException{
		return null;
	}
	
	public ResponseEntity<List<Membership>> viewMembershipsByBenefit(String benefit) {
		return null;
	}
	
	public ResponseEntity<List<Membership>> viewMembershipsByTypeAndAccessHours(String membershipType, int monthlyAccessHours) {
		return null;
	}
	
	public ResponseEntity<Map<String,Integer>> getMembershipCountTypeWise() {
		return null;
	}
}