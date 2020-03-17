package configs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCoach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("appConf.xml");
		
		TennisCoach c = context.getBean("myCoach",TennisCoach.class);
		
		
		System.out.println(c.getDailyWorkout());
		
		context.close();
	}

}
