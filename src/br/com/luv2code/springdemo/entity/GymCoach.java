package br.com.luv2code.springdemo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import br.com.luv2code.springdemo.IF.Coach;
import br.com.luv2code.springdemo.IF.FortuneService;

@Component
public class GymCoach implements Coach {

	private FortuneService fortuneService;
	@Value("${coach.email}")
	private String coachEmail;
	@Value("${coach.team}")
	private String teamName;

	public GymCoach(FortuneService service) {
		this.fortuneService = service;

	}

	public String getCoachEmail() {
		return coachEmail;
	}

	public void setCoachEmail(String coachEmail) {
		this.coachEmail = coachEmail;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
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
