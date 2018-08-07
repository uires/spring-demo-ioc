package br.com.luv2code.springdemo.entity;

import org.springframework.stereotype.Component;

import br.com.luv2code.springdemo.IF.Coach;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Pratice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
