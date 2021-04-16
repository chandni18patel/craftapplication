package com.springboot.craftapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.craftapplication.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
