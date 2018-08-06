package br.com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.luv2code.springdemo.IF.Coach;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("thatTennisCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();

	}
}
