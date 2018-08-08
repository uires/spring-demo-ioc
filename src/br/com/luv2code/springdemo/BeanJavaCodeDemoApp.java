package br.com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.luv2code.springdemo.configuration.ConfigurationJavaCodeBeans;
import br.com.luv2code.springdemo.entity.GymCoach;

public class BeanJavaCodeDemoApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ConfigurationJavaCodeBeans.class);
		GymCoach theCoach = applicationContext.getBean("gymCoach", GymCoach.class);
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println("Coach e-mail ->" + theCoach.getCoachEmail());
		System.out.println("Team name ->" + theCoach.getTeamName());
		System.out.println(theCoach.getFortune()[0]);
		System.out.println(theCoach.getFortune()[1]);
		System.out.println(theCoach.getFortune()[2]);
		applicationContext.close();
	}
}

