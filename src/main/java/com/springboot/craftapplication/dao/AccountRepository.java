package com.springboot.craftapplication.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.craftapplication.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	public Account findByFirstName(String name);
	
	@Query
	public Optional<Account> findByEmail(String email);
}
