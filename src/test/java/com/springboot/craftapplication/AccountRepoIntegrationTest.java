package com.springboot.craftapplication;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.craftapplication.dao.AccountRepository;
import com.springboot.craftapplication.dto.AccountDTO;
import com.springboot.craftapplication.dto.AddressDTO;
import com.springboot.craftapplication.model.Account;

@RunWith(SpringRunner.class)

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AccountRepoIntegrationTest {
//	@Autowired
//	EntityManager entityManager;
	
	@Autowired
    private MockMvc mockMvc;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Test
	  void registrationWorksThroughAllLayers() throws Exception {
		
		AddressDTO address = new AddressDTO();
		address.setCity("Toronto");
		address.setProvince_state("Ontario");
		address.setStreet("Danforth Road");
		address.setCountry("Canada");
		
	    AccountDTO accountDTO = new AccountDTO();
	    accountDTO.setFirstName("Chandni");
		accountDTO.setLastName("Patel");
		accountDTO.setEmail("ptlchandni.18@gmail.com");
		accountDTO.setAddress(address);
	  

//		mockMvc.perform(post("/account/saveAccount"))
//	            .contentType("application/json")
//	            .contentType(MediaType.APPLICATION_JSON))
//	            .andExpect(status().isOk())
//	            .andExpect(content()
//	            .contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
//
//	   Account userEntity = accountRepository.findByFirstName("Chandni");
//	    assertThat(userEntity.getEmail()).isEqualTo("ptlchandni.18@gmail.com");
	  }

}
