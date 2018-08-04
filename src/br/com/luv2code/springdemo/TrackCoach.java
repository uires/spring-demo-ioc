package br.com.luv2code.springdemo;

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

}
