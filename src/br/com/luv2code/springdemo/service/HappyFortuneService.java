package br.com.luv2code.springdemo.service;

import br.com.luv2code.springdemo.IF.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is your lucky day!";
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
