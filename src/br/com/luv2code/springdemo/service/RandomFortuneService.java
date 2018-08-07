package br.com.luv2code.springdemo.service;

import org.springframework.stereotype.Component;

import br.com.luv2code.springdemo.IF.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return ">> Field saved";
	}

	@Override
	public double[] getFortune() {
		return new double[] {
				(Math.random() * 10000),
				(Math.random() * 10000),
				(Math.random() * 10000) 
				};
	}

}
