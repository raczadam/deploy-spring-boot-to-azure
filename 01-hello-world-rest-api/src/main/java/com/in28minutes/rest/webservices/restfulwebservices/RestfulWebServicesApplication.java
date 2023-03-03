package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		log.info("Application start");
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}
}