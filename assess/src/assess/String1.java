package assess;

import java.util.Scanner;

public class String1 {
	public static String work(String s) {
		 String s1 = "";
		
	       
			//char c=s1.charAt(0);
			if(s.charAt(0)=='j'&&s.charAt(1)!='b') {
				s1=s.replace(s.charAt(1), ' ');
				
			}
			else if(s.charAt(0)!='j'&&s.charAt(1)=='b') {
				s1=s.replace(s.charAt(0), ' ');
			}
			else if(s.charAt(0)!='j'&&s.charAt(1)!='b') {
				String s2=s.replace(s.charAt(0), ' ');
				s1=s2.replace(s2.charAt(0), ' ');
			}
			else {
				s1=s;
			}
			return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//char r= 'm';
		//s.replace(s.charAt(1), r);
		//System.out.println(s);
		System.out.println(String1.work(s));
	}

}
