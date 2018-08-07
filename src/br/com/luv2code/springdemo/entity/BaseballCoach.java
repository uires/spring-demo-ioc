package br.com.luv2code.springdemo.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.luv2code.springdemo.IF.Coach;
import br.com.luv2code.springdemo.IF.FortuneService;

@Component
@Scope("prototype")
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

	@Override
	public double[] getFortune() {
		return new double[] { 10.3, 22223.13, 200.10 };
	}

}
