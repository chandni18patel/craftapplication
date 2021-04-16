
package com.springboot.craftapplication.service;


import javax.validation.Payload;

//@Documented
//@Constraint(validatedBy = AddressValidator.class)
//@Target(value = { ANNOTATION_TYPE })
//@Retention(value = null)
public @interface AddressConstrain {
	String message() default "Invalid phone number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}