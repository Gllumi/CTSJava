package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=new ClassPathXmlApplicationContext("bean.xml");
		StudentBean sb = (StudentBean) factory.getBean("std");
		sb.Stu();
		}

}
