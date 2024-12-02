package com.hotel_mgt_system.hotel_mgt_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.hotel_mgt_system")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
