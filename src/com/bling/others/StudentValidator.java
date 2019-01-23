package com.bling.others;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bling.model.Student;

@Service
public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Student.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {        
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required.name","Field name is required.");
	}
}
