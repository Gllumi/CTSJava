package assess;

import java.util.Scanner;

public class Main {
	public static int checkUnique(String s) {
		 int[] count = new int[300]; 
	       
	      
	        int i; 
	        for (i = 0; i < s.length(); i++) { 
	                 count[(int)s.charAt(i)]++; 
	        }
	        int n = i; 
	        int cnt=0;
	        
	        for (i = 0; i < n; i++) {
	            if (count[(int)s.charAt(i)] == 1) {
	                 cnt++;
	            }
	        }
	          
		
		return cnt ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//System.out.println(Main.checkUnique(s));
		int x = Main.checkUnique(s);
		if(x==0) {
			System.out.println("-1");
		}
		else {
			System.out.println(Main.checkUnique(s));
		}
	}

}
