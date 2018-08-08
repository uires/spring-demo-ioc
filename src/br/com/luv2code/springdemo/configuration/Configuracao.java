package br.com.luv2code.springdemo.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
*	Configurando Spring com código Java, 
*	consequentemente excluindo qualquer arquivo XML 
*/

@Configuration
@ComponentScan("br.com.luv2code.springdemo")
public class Configuracao {
	
}
