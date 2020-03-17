package dpro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MaxAr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList ar = new ArrayList();
		System.out.println("Enter number of entries");
		//int n = sc.nextInt();
		/*for(int i=0; i<n;i++) {
			ar.add(sc.next());
		}*/
		ar.add(sc.next());
		Iterator itr = ar.iterator();
		int max=0;
		String topper = null;
		while(itr.hasNext()) {
			String temp =(String) itr.next();
			StringTokenizer stk = new StringTokenizer(temp," ");
			
			for(int i=0;i<stk.countTokens();i++) {
				String name = stk.nextToken();
			}
	/*		int m1 = Integer.parseInt(stk.nextToken());
			int m2 = Integer.parseInt(stk.nextToken());
			int m3 = Integer.parseInt(stk.nextToken());
			int sum = m1+m2+m3;
			
			if(sum>=max) {
				max=sum;
				topper = name;
			}*/
			 
				
			
		}
		System.out.println(topper);
	}

}
