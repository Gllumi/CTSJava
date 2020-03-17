package configs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(HelloworldCon.class);
		Helloworld helloworld=ctx.getBean(Helloworld.class);
		helloworld.setMessage("Hello World!!");
		helloworld.getMessage();
		helloworld.showData();
		
		
	}

}
