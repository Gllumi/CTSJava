package jdbcprogram;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationcontext.xml");
		Scanner sc = new Scanner(System.in);
		EmployeeDao ed= (EmployeeDao) ctx.getBean("edao");
		Employee emp = new Employee();
		String name = sc.next();
		String dept = sc.next();
		String desg = sc.next();
		String comp = sc.next();
		String mail = sc.next();
		emp.setEname(name);
		emp.setDept(dept);
		emp.setDesg(desg);
		emp.setComp(comp);
		emp.setEmail(mail);
		emp.setEid("5678");
		/*emp.setEname("Jane");
		emp.setEid("5678");
		emp.setDept("Magic");
		emp.setDesg("Healer");
		emp.setComp("CDK");
		emp.setEmail("jane@doe.com");*/
		
		
		int status=ed.updateEmployee(emp);
		System.out.println(status);
		System.out.println("Record updated");
		
	}

}
