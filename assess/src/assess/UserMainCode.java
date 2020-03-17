package assess;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserMainCode {
	public HashMap increaseSalaries(HashMap<Integer,String> h,HashMap<Integer,Integer> h1) {
		HashMap <Integer,Integer> h2 = new <Integer,Integer> HashMap();
		
		
		 Set keys =h.keySet();
		 Iterator itr=keys.iterator();
		 while(itr.hasNext()){
			 
		 	int id = (int) itr.next();
		 	String s=h.get(id);
		 	if(s.equals("Manager")){
		 		int newsal = h1.get(id)+5000;
		 		h2.put(id,newsal);
		 	}
		 }return h2 ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		UserMainCode u = new UserMainCode();
		HashMap<Integer,String> h = new <Integer,String>HashMap();
		HashMap<Integer,Integer> h1 = new <Integer,Integer>HashMap();
		HashMap<Integer,Integer> h3 = new <Integer,Integer>HashMap();
		int n = sc.nextInt();;
		for(int i=0;i<n;i++) {
			System.out.println("Enter id");
			int id= sc.nextInt();
			System.out.println("enter Desg");
			String s= sc.next();
			System.out.println("enter Sal");
			int sa=sc.nextInt();
			h1.put(id, sa);
			h.put(id, s);
		}
		h3=u.increaseSalaries(h,h1);
		System.out.println(h3);
		
		
	}

}
