package br.com.luv2code.springdemo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.luv2code.springdemo.IF.Coach;
import br.com.luv2code.springdemo.IF.FortuneService;

@Component
public class TennisCoach implements Coach {
	@Autowired
	private FortuneService fortuneService;

	public TennisCoach() {

	}
	/*
	 * @Autowired public void setFortuneService(FortuneService service) {
	 * this.fortuneService = service; }
	 */

	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Pratice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getDailyFortune();
	}

	public double[] getFortune() {
		return this.fortuneService.getFortune();
	}

}
