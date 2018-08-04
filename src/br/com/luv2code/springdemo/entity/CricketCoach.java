package br.com.luv2code.springdemo.entity;

import br.com.luv2code.springdemo.IF.Coach;
import br.com.luv2code.springdemo.IF.FortuneService;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;

	private String emailAddress;
	private String team;

	public CricketCoach() {
		System.out.println("Inside no-arg construct");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method -> setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method -> setTeam");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 5 stump pentagon Drill";
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method fortuneService, by spring");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return "Cricket Coach ->" + this.fortuneService.getDailyFortune();
	}

}
