package br.com.luv2code.springdemo.service;

import br.com.luv2code.springdemo.IF.FortuneService;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		return "Today is your lucky day!";
	}

}
