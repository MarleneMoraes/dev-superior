package com.devsuperior.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	// Resgistra uma instancia unica (singleton) de um objeto RestTemplate para injetar em outros componentes
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
