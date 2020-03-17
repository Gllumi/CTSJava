package regexs;

import java.util.Scanner;
import java.util.regex.*;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		UserMainCode.validateHexadecimalColorCode(s);
		

/*	(?=.*[0-9])       # a digit must occur at least once
  	(?=.*[a-z])       # a lower case letter must occur at least once
	(?=.*[A-Z])       # an upper case letter must occur at least once
	(?=.*[@#$%^&+=])  # a special character must occur at least once
	(?=\S+$)          # no whitespace allowed in the entire string
	.{8,}             # anything, at least eight places though
*/
	
	}

}
