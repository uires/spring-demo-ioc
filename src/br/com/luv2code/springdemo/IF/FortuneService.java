package br.com.luv2code.springdemo.IF;

import org.springframework.stereotype.Component;

@Component
public interface FortuneService {
	public String getDailyFortune();
	public double[] getFortune();
}
