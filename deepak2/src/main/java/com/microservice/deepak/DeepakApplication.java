package com.microservice.deepak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@SpringBootApplication
public class DeepakApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeepakApplication.class, args);
		System.out.println("Server has been started !!");
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
