package com.springboot.craftapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.craftapplication.dto.AddressDTO;

@RestController
public class AddressController {
	
	@GetMapping("/welcome")
	public String address() {
		return "Welcome to class";
	}
	
	@PostMapping("/verifyAddress")
    public String getPostRequest(@RequestBody AddressDTO address) {
        System.out.println(address);
        return "Post Ok";
    }
	
}
