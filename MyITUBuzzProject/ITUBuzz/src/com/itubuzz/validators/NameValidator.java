package com.itubuzz.validators;
/**
 * International Technological University, San Jose
 * Validating a user entered name 
 * created on : 03/03/2016
 * @author Kavya
 *
 */
public class NameValidator {
      
	public static boolean validateUserNames(String firstName, String middleName, String lastName){
		boolean nameVal = false;
		
		if(firstName != null  && lastName != null  ){
			String upperCaseChars = "(.*[A-Z].*)";
			String lowerCaseChars = "(.*[a-z].*)";
	        if ((firstName.matches(upperCaseChars) && middleName.matches(upperCaseChars) && lastName.matches(upperCaseChars)) || (firstName.matches(lowerCaseChars ) && middleName.matches(lowerCaseChars ) && lastName.matches(lowerCaseChars ))){
	        	
                
			nameVal = true;
                
		    }
	    }
		else{
			System.err.println("First Name and Last Name cannot be null and Names should not contain Alphanumeric characters ! ");
		}
		
		return nameVal;
		
	}
}
