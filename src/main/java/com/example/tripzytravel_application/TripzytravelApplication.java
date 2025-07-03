package com.example.tripzytravel_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TripzytravelApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripzytravelApplication.class, args);
	}

}
