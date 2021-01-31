package com.scb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ScbBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScbBankingApplication.class, args);
	}

}
