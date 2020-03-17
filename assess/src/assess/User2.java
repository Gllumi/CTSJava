package assess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class User2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeMap tm = new TreeMap();
		ArrayList<Integer> ar = new ArrayList();
		int sum=0;
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("id");
			int a=sc.nextInt();
			tm.put(a, sc.nextInt());
			
		}
		
		System.out.println(tm);
		int x=0;
		 Set keys =tm.keySet();
		 Iterator itr=keys.iterator();
		 while(itr.hasNext()){
			 int id=(int) itr.next();
			 ar.add((Integer) tm.get(id));
		 }
		 Collections.sort(ar);
		 sum= ar.get(0) + ar.get(1) +ar.get(2);
		
		
	
		System.out.println("Sum is "+sum);

	}

}
