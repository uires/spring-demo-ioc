package br.com.luv2code.springdemo;

public class TrackCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Run 5k in 3 hours";
	}

	@Override
	public String getNameOfCoach() {
		return "John";
	}

}
