package br.com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.luv2code.springdemo.IF.Coach;
import br.com.luv2code.springdemo.configuration.Configuracao;

public class JavaConfigurationDemoApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(
				Configuracao.class);
		Coach theCoach = configApplicationContext.getBean("tennisCoach", Coach.class);
		System.out.println("Testando classe de configuração ->");
		System.out.println(theCoach.getDailyWorkout());
		configApplicationContext.close();
	}

}
