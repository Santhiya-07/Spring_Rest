package com.capg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
