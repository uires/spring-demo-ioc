package br.com.luv2code.springdemo.service;

import org.springframework.stereotype.Component;

import br.com.luv2code.springdemo.IF.FortuneService;

@Component
public class DataBaseFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return ">> Field saved";
	}

	@Override
	public double[] getFortune() {
		return new double[] { 1011.3, 755.55, 3220.55 };
	}

}
