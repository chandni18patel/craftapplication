package com.springboot.craftapplication.service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AddressValidator implements ConstraintValidator<AddressConstrain, String> {

	@Override
	public boolean isValid(String country, ConstraintValidatorContext context) {
		
		if(country.equalsIgnoreCase("CANADA") ||  country.equalsIgnoreCase("US") || country.equalsIgnoreCase("USA")){
           return true;
        }
		return false;
	}

}
