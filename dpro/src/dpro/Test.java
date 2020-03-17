package dpro;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		//StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		String st= sc.nextLine();
		StringTokenizer stk = new StringTokenizer(st," ");
		while(stk.hasMoreTokens()) {
			s = stk.nextToken();
			String d =s.toUpperCase();
			char c = d.charAt(d.length()-1);
			//sb.append(c).append("$");
			
			System.out.print(c+"$");
		}
		//System.out.println(sb.toString());
		
	}

}
