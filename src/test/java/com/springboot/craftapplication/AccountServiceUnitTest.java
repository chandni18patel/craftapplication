package com.springboot.craftapplication;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.craftapplication.dao.AccountRepository;
import com.springboot.craftapplication.model.Account;
import com.springboot.craftapplication.model.Address;
import com.springboot.craftapplication.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceUnitTest {
	@Autowired
	private AccountService accountService;
	
	@MockBean
	private AccountRepository accountRepository;
	
	@Test
    public void testRetrieveAccounttWithMockRepository() throws Exception {

		Address address = new Address();
		Account acc = new Account();
		acc.setFirstName("Chandni");
		acc.setLastName("Patel");
		acc.setAddress(address);
        Optional<Account> optAccount = Optional.of(acc);
        when(accountRepository.findById((long) 1)).thenReturn(optAccount);
        
        Optional<Account> result = accountService.retrieveAccount((long) 1);
        if(result.isPresent()) {
        	Account existingAccount = result.get();
        	assertTrue(existingAccount.getFirstName().contains("Chandni"));
        }
        
    }
	
	
}
