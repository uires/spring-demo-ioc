package br.com.luv2code.springdemo.entity;

import br.com.luv2code.springdemo.IF.Coach;
import br.com.luv2code.springdemo.IF.FortuneService;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;

	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	public void initMethodCall() {
		System.out.println("Método de inicialização do BEAN");
	}

	public void endMethodCall() {
		System.out.println("Método de finalização do BEAN");
	}

}
