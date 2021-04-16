package com.springboot.craftapplication.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.craftapplication.dto.AccountDTO;
import com.springboot.craftapplication.service.AccountService;
import com.springboot.craftapplication.service.AddressVerificationService;

@RestController
public class AccountController {
	
	@Autowired(required=true)
	private AccountService accountService;
	
	@Autowired
	AddressVerificationService addressValidator;
	
	@PostMapping("/account/saveAccount")
	public ResponseEntity<String> postAccount(@Valid @RequestBody AccountDTO accountDTO){
		
		//ValidationUtils.invokeValidator(addressValidator, accountDTO, null);
		
		if(accountService.findByEmail(accountDTO.getEmail()) !=null ) {
			return ResponseEntity.ok("account already exists with given email!");

		}  else {
			accountService.saveAccount(accountDTO);
			return ResponseEntity.ok("Account is valid");
		}
	}
	
	@GetMapping("/account/getAccounts") 
	public List<AccountDTO> getAllAccounts()
	{
		return accountService.list();
	}
	
	@GetMapping("/account/get-by-id")
	public ResponseEntity<String> getAccount(@RequestParam Long accountId){
			AccountDTO account = accountService.findAccountByID(accountId);
		if (account != null) {
			return ResponseEntity.ok(account.toString());
		}
		else {
			return ResponseEntity.ok("Can not find account in database");
		}
		
	}
	
}
 