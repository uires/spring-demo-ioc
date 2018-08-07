package br.com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.luv2code.springdemo.IF.Coach;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		for (int i = 0; i < theCoach.getFortune().length; i++) {
			System.out.println(theCoach.getFortune()[i]);
		}
		context.close();

	}
}
