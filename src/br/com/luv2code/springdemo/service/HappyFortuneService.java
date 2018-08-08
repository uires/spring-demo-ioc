package br.com.luv2code.springdemo.service;

import org.springframework.stereotype.Component;

import br.com.luv2code.springdemo.IF.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is ---!";
	}

	@Override
	public double[] getFortune() {
		double[] array = new double[3];
		for (int i = 0; i < array.length; i++) {
			array[i] = (Math.random() * 1000);
		}
		return array;
	}

}
