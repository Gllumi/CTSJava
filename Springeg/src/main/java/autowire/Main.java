package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=new ClassPathXmlApplicationContext("bean3.xml");
		EmployeeBean sb = (EmployeeBean) factory.getBean("employee");
		//sb.Stu();
		System.out.println(sb.getFname());
		System.out.println(sb.getDept().getName());
	}

}
