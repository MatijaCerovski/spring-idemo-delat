package com.matija.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.matija.web.dto.UserRegistrationDTO;

public class PasswordMatchesValidator 
implements ConstraintValidator<PasswordMatches, Object> { 
   
  @Override
  public void initialize(PasswordMatches constraintAnnotation) {       
  }
  @Override
  public boolean isValid(Object obj, ConstraintValidatorContext context){   
	  UserRegistrationDTO user = (UserRegistrationDTO) obj;
      return user.getPassword().equals(user.getMatchingPassword());    
  }     
}