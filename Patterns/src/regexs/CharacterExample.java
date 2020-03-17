package regexs;

import java.util.regex.Pattern;

public class CharacterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//true
		System.out.println(Pattern.matches("[xyz]{3}", "xyz"));
		//false
		System.out.println(Pattern.matches("[^xyz]", "x"));
		//false (x and y comes more than once)
		System.out.println(Pattern.matches("[xyz]", "xxyyyyyz"));
		
		//MetaCharacters
		//d means digit
		
		System.out.println(Pattern.matches("d", "abc"));
		
		System.out.println(Pattern.matches("d", "1"));
		
		System.out.println(Pattern.matches("d", "1234"));
		
		System.out.println(Pattern.matches("\\d", "2"));
		
		System.out.println(Pattern.matches(".*[0-9]", "asd"));
		
		System.out.println(Pattern.matches("\\bPRO","PROnoune"));
	}

}
