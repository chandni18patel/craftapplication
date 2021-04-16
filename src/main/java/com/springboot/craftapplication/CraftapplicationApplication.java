package com.springboot.craftapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.springboot.craftapplication"} )
public class CraftapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CraftapplicationApplication.class, args);
	}

}
