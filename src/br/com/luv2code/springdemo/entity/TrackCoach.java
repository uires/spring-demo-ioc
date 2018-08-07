package br.com.luv2code.springdemo.entity;

import br.com.luv2code.springdemo.IF.Coach;
import br.com.luv2code.springdemo.IF.FortuneService;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5k in 3 hours";
	}

	@Override
	public String getDailyFortune() {
		return "This is your -> " + this.fortuneService.getDailyFortune();
	}

	@Override
	public double[] getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
