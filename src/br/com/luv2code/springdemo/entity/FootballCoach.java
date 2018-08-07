package br.com.luv2code.springdemo.entity;

import org.springframework.stereotype.Component;

import br.com.luv2code.springdemo.IF.Coach;

@Component
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice kick to the goal";
	}

	@Override
	public String getDailyFortune() {
		return "Today is your bad day!";
	}

	@Override
	public double[] getFortune() {
		return null;
	}

}
