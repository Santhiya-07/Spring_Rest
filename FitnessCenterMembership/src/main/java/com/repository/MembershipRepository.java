package com.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Membership;

//Provide necessary annotation
@Repository
public interface MembershipRepository extends JpaRepository<Membership, String> {
   
	 // Provide necessary methods to view memberships by benefit, view memberships by membership type and monthly access hours and get membership count for each type
    List<Membership> findByBenefitsContaining(String benefit);
    List<Membership> findByMembershipTypeAndMonthlyAccessHoursGreaterThan(String membershipType,int monthlyAccessHours);
    @Query("select m.membershipType,Count(m) from membership m group by m.membershipType")
    Map<String, Integer> getMembershipCountTypeWise();
    
    
}