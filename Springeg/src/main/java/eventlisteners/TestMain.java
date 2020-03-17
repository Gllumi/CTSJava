package eventlisteners;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext cot = new ClassPathXmlApplicationContext("bean4.xml");
		 cot.start();
		 
		 HelloWorld obj =(HelloWorld) cot.getBean("helloworld");
		 obj.getMessage();                                                            
	}

}
