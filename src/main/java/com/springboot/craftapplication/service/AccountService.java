package com.springboot.craftapplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.craftapplication.dao.AccountRepository;
import com.springboot.craftapplication.dto.AccountDTO;
import com.springboot.craftapplication.dto.AddressDTO;
import com.springboot.craftapplication.model.Account;
import com.springboot.craftapplication.model.Address;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;
	
	public List<AccountDTO> list() {
	  List<Account> accountList = accountRepository.findAll();
	  List<AccountDTO> dtoList = new ArrayList<>();
	  
	  for(Account account : accountList) {
		  dtoList.add(toAccountDTO(account));
	  }
	  return dtoList;
	}
	
	public void saveAccount(AccountDTO accountDTO) {
		accountRepository.save(toAccountEntity(accountDTO));
	}
	
	public Account findByEmail(String email) {
		Optional<Account> account = accountRepository.findByEmail(email);

		if(account.isPresent() ) { 
			return account.get();

		}
		return null;
	}
	
	public Account getAccountFirstName(String name) {
        return accountRepository.findByFirstName(name);
    }
	
	public AccountDTO findAccountByID(Long accountID) {
		Optional<Account> account = accountRepository.findById(accountID);
		if(account.isPresent()) {
			 return toAccountDTO(account.get());
		}
		return null;
	}

	public Optional<Account> retrieveAccount(Long i) {
		return accountRepository.findById(i);
	}
	
	public AccountDTO toAccountDTO(Account account) {
		AccountDTO dto = new AccountDTO();
		
		dto.setFirstName(account.getFirstName());
		dto.setLastName(account.getLastName());
		dto.setEmail(account.getEmail());
		dto.setAddress(toAddressDTO(account.getAddress()));
		
		return dto;
	}
	
	public AddressDTO toAddressDTO(Address address) {
		AddressDTO dto = new AddressDTO();
		
		dto.setStreet(address.getStreet());
		dto.setCity(address.getCity());
		dto.setCountry(address.getCountry());
		dto.setProvince_state(address.getProvince_state());
		
		return dto;
	}

	public Account toAccountEntity(AccountDTO accountDTO) {
		
		Account account = new Account();
		account.setFirstName(accountDTO.getFirstName());
		account.setLastName(accountDTO.getLastName());
		account.setEmail(accountDTO.getEmail());
		account.setAddress(toAddressEntity(accountDTO.getAddress()));
		
		return account;
	}
	
	public Address toAddressEntity(AddressDTO addressDTO) {
		Address address = new Address();
		
		address.setStreet(addressDTO.getStreet());
		address.setCity(addressDTO.getCity());
		address.setCountry(addressDTO.getCountry());
		address.setProvince_state(addressDTO.getProvince_state());
	
		return address;
	}

}


 