package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.InvalidMembershipException;
import com.model.Membership;
import com.repository.MembershipRepository;

//Provide necessary annotation
@Service
public class MembershipServiceImpl implements IMembershipService{
	
	//Provide necessary annotation
	@Autowired
	private MembershipRepository membershipRepo;

	public Membership addMembership(Membership membership) {
		// fill the code
		
		return membershipRepo.save(membership);
	}

	public Membership viewMembershipById(String membershipId) throws InvalidMembershipException {
		// fill the code
		
		return membershipRepo.findById(membershipId)
				              .orElseThrow(()-> new InvalidMembershipException(membershipId));
	}
	
	public List<Membership> viewMembershipsByBenefit(String benefit) {
		// fill the code
		return membershipRepo.findByBenefitsContaining(benefit);
	} 

	public List<Membership> viewMembershipsByTypeAndAccessHours(String membershipType, int monthlyAccessHours) {
		// fill the code
		return membershipRepo.findByMembershipTypeAndMonthlyAccessHoursGreaterThan(membershipType, monthlyAccessHours);
	} 	  	      	 	    	      	    	      	 	
	
	public Map<String, Integer> getMembershipCountTypeWise() {
		// fill the code
		return membershipRepo.getMembershipCountTypeWise();
	}

}
