package regexs;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserMainCode {

	public static void validatePass(String s) {
		// TODO Auto-generated method stub
		
		if(Pattern.matches("(?=.*[0-9])(?=.*[@#$%^&+=]).{6,20}", s)) {
			System.out.println("PASSWORD IS VALID");
			
		}
		else {
			System.out.println("INVALID PASSWORD");
		}
	}
	
	public static void validateString(String s) {
		String s1 = "[P][R][O]([a-z]{4})([0-9]{3})";
		String s2 = "[F][I][N]([a-z]{4})([0-9]{3})";
		String s3 = "[T][e][s][t]([a-z]{4})([0-9]{3})";
		if(Pattern.matches(s1, s)||Pattern.matches(s2, s)||Pattern.matches(s3, s)){
			System.out.println("Entered String is Correct");
		}
		else {
			System.out.println("String Pattern is Incorrect");
		}
		
	}
	
	public static void validateHexadecimalColorCode(String s) {
		String s1 = "[#]([0-9A-F]{6})";
		if(Pattern.matches(s1, s)) {
			System.out.println("Valid color code");
		}
		else {
			System.out.println("Invalid color code");
		}
	}

}
