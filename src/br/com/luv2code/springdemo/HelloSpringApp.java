package br.com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Coach theCoach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getNameOfCoach() + " say:");
		System.out.println(theCoach.getDailyWorkout());
		classPathXmlApplicationContext.close();
	}
}
