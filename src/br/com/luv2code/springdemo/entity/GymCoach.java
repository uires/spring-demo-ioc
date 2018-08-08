package br.com.luv2code.springdemo.entity;

import org.springframework.stereotype.Component;

import br.com.luv2code.springdemo.IF.Coach;
import br.com.luv2code.springdemo.IF.FortuneService;

@Component
public class GymCoach implements Coach {

	private FortuneService fortuneService;

	public GymCoach(FortuneService service) {
		this.fortuneService = service;

	}

	@Override
	public String getDailyWorkout() {
		return "Pratice Pick-Deck fly back.";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getDailyFortune();
	}

	@Override
	public double[] getFortune() {
		return this.fortuneService.getFortune();
	}

}
