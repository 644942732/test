package com.example;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.service.Service;

@Configuration
public class AppConfig {

	@Bean
	public Service service() {
		Service service = new Service();
		service.setList(new ArrayList<String>());
		return service;

	}

}
