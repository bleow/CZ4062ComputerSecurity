package com.cz4062.log4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VulnerableAppApplication {

	public static void main(String[] args) {
		System.out.println("HELLO WORLDDDDD");
		SpringApplication.run(VulnerableAppApplication.class, args);
	}

}
