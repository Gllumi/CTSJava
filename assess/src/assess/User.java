package assess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class User {
		
		public static int minSum(HashMap<Integer, Integer> h) {
			ArrayList<Integer> ar = new ArrayList();
			int sum=0;
			 Set keys =h.keySet();
			 Iterator itr=keys.iterator();
			 while(itr.hasNext()){
				 int id=(int) itr.next();
				 ar.add(h.get(id));
			 }
			 Collections.sort(ar);
			 sum= ar.get(0) + ar.get(1) +ar.get(2);
			
			
			return sum;
		}
		
		public static void main(String args[]) {
			HashMap<Integer,Integer> h = new HashMap();
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i=0;i<n;i++) {
				System.out.println("Enter id");
				int a=sc.nextInt();
				System.out.println("Enter Marks");
				int b=sc.nextInt();
				h.put(a,b);
			}
			 int x=User.minSum(h);
			 System.out.println("SUM IS "+x);
		}
	
}
