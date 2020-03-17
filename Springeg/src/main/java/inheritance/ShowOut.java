package inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import inheritance.Employee;;

public class ShowOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=new ClassPathXmlApplicationContext("bean2.xml");
		Employee sb = (Employee) factory.getBean("myEmployeeBean");
		sb.show();
		}

}
