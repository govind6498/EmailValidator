package com.bridgelabz.emailvalidator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidator {
	public static void checkValidEmail(String email) {
		boolean isEmail;
		String emailRegex="^[a-zA-Z]*[@]{1}[.a-zA-Z]*$";
		Pattern patternObject = Pattern.compile(emailRegex);
		if(email==null) {
			isEmail = false;
		}
		Matcher matcherObject = patternObject.matcher(email);
		isEmail = matcherObject.matches();
		if(isEmail) {
			System.out.println(email+" is a Valid Email Address");
			System.exit(0);
		}
		System.out.println(email+" is not a Valid Email Address");
	}
	public static void main(String[] args) {
		String email = "abc.xyz@bridgelabz.co.in";
		checkValidEmail(email);

		email = "abc@abc.com";
		checkValidEmail(email);
	}
}
