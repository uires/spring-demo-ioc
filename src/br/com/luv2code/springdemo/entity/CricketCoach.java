package br.com.luv2code.springdemo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import br.com.luv2code.springdemo.IF.Coach;
import br.com.luv2code.springdemo.IF.FortuneService;

public class CricketCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	private String emailAddress;
	private String team;

	public CricketCoach() {
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 5 stump pentagon Drill";
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public double[] getFornute() {
		return fortuneService.getFortune();
	}
	
	@Override
	public String getDailyFortune() {
		return "Cricket Coach ->" + this.fortuneService.getDailyFortune();
	}

	@Override
	public double[] getFortune() {
		return this.fortuneService.getFortune();
	}

}
