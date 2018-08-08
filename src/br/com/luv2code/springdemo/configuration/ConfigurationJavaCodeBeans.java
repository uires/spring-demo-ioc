package br.com.luv2code.springdemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.luv2code.springdemo.IF.Coach;
import br.com.luv2code.springdemo.IF.FortuneService;
import br.com.luv2code.springdemo.entity.GymCoach;
import br.com.luv2code.springdemo.service.RandomFortuneService;

@Configuration
public class ConfigurationJavaCodeBeans {
	@Bean
	public FortuneService service() {
		return new RandomFortuneService();
	}

	@Bean
	public Coach gymCoach(FortuneService service) {
		GymCoach coach = new GymCoach(service);
		
		return coach;
		
	}
}
