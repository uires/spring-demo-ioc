package br.com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.luv2code.springdemo.IF.Coach;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext pathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Coach theCoach = pathXmlApplicationContext.getBean("baseballCoach", Coach.class);
		Coach alphaCoach = pathXmlApplicationContext.getBean("baseballCoach", Coach.class);

		System.out.println("they are equals: " + (theCoach == alphaCoach));
		System.out.println("theCoach: " + theCoach);
		System.out.println("alphaCoach: " + alphaCoach);
		pathXmlApplicationContext.close();
	}
}
