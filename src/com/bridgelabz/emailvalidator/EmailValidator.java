package com.bridgelabz.emailvalidator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidator {
	public static void checkValidEmail(String email) {
		boolean isEmail;
		String emailRegex="^[a-zA-Z]+[a-zA-Z0-9]*[- + . _]?[a-zA-Z0-9]*[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z]+[.]?[a-zA-Z] {2}$";
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

		email = "abc123@.com";
		checkValidEmail(email);

		email = "abc123@.com.com";
		checkValidEmail(email);

		email = "abc123@gmail.a";
		checkValidEmail(email);

		email = "abc@%*.com";
		checkValidEmail(email);

		email = "abc@gmail.com.1a";
		checkValidEmail(email);

		email = "abc@gmail.com.aa";
		checkValidEmail(email);
	}
}
