package br.com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.luv2code.springdemo.IF.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Coach theCoach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		classPathXmlApplicationContext.close();
	}
}
