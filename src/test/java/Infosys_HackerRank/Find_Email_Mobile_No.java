package Infosys_HackerRank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find_Email_Mobile_No {
	
	public static void main(String[] args) {
		String Data="mahi@sample.com,mahi@,mahismapple.com,9876543215,9234567890,234567890";
		
		String emailPattern="[a-zA-Z0-9.%+-]+@sample.com";
		String MobilePattern="\\b\\d{10}\\b";
		
		Pattern emailRegex = Pattern.compile(emailPattern);
		Pattern mobileRegex = Pattern.compile(MobilePattern);
		// Extract email Pattern
		Matcher emailMatcher = emailRegex.matcher(Data);
		System.out.println("Valid Email Address");
		while(emailMatcher.find()) {
			System.out.println(emailMatcher.group());
		}
		// Extract Mobile Pattern
				Matcher MobileMatcher = mobileRegex.matcher(Data);
				System.out.println("Valid Mobile No ");
			while(MobileMatcher.find()) {
					System.out.println(MobileMatcher.group());
				}
	}

}
