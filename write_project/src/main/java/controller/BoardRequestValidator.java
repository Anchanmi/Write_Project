package controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import board.BoardRequest;

public class BoardRequestValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return BoardRequest.class.isAssignableFrom(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "subject", "required");
		ValidationUtils.rejectIfEmpty(errors, "content", "required");
	}
}
