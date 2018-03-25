package com.control;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.Person;

@Component
public class SampleValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		// TODO Auto-generated method stub
		return Person.class.equals(cls);
	}

	@Override
	public void validate(Object obj, Errors err) {
		// TODO Auto-generated method stub
		System.out.println("validation being checked");
		 ValidationUtils.rejectIfEmpty(err, "name", "person.name.empty");
	}

}
