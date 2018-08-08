package br.com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.luv2code.springdemo.IF.Coach;
import br.com.luv2code.springdemo.configuration.ConfigurationJavaCodeBeans;

public class BeanJavaCodeDemoApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ConfigurationJavaCodeBeans.class);
		Coach theCoach = applicationContext.getBean("gymCoach", Coach.class);
		System.out.println(theCoach.getFortune()[0]);
		System.out.println(theCoach.getFortune()[1]);
		System.out.println(theCoach.getFortune()[2]);
		applicationContext.close();
	}
}
