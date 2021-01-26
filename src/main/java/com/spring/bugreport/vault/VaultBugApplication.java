package com.spring.bugreport.vault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VaultBugApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(VaultBugApplication.class, args);
		String message = context.getEnvironment().getProperty("test.message");
		System.out.println("message=" + message);
	}

}
