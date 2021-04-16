package com.springboot.craftapplication.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.springboot.craftapplication.model.Address;

@Service
public class AddressVerificationService implements Validator {

	@Override
	public boolean supports(Class<?> aClass) {
		return Address.class.isAssignableFrom(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        Address add = (Address) o;
        if(!add.getCountry().equalsIgnoreCase("CANADA") ||  !add.getCountry().equalsIgnoreCase("US") || !add.getCountry().equalsIgnoreCase("USA")){
            errors.rejectValue("country", "Country must be either CANADA or USA");
        }
	}

}
