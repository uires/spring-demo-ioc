package br.com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.luv2code.springdemo.IF.Coach;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		boolean isInstanceOf = (theCoach == alphaCoach);
		System.out.println("is : " + isInstanceOf);
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		context.close();

	}
}
