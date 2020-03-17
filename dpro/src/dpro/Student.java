package dpro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class Student implements Comparable<Student> {
	String name;
	String age;
	String city;
	public Student(String name, String age, String city) {
		super();
		this.name=name;
		this.age=age;
		this.city=city;
	}
	@Override
	public String toString() {
		return "("+name + ", " + age + ", " + city+")" ;
	}
	
	public int compareTo(Student student) {
		if(age.compareTo(student.age)<0) {
			return 1;
		}
		else if(age.compareTo(student.age)>0) {
			return -1;
		}
		else
			return 0;
	}
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList();
		TreeSet<Student> m = new TreeSet<Student>();
		Student s1 = new Student("John","26","Bangalore");
		Student s2 = new Student("Jacob","34","Hyderabad");
		Student s3 = new Student("Jessie","22","Pune");
		Student s4 = new Student("Johnny","30","Chennai");
		Student s5 = new Student("Joe","24","Delhi");
		
		m.add(s1);
		m.add(s2);
		m.add(s3);
		m.add(s4);
		m.add(s5);
		
		//System.out.println(m);
		
		for(Student str:m) {
			System.out.println(str);
			
			
			
		
		
	}

}}
