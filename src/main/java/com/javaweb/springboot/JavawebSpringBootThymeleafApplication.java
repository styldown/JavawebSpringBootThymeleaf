package com.javaweb.springboot;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(enableDefaultTransactions = false)
public class JavawebSpringBootThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavawebSpringBootThymeleafApplication.class, args);
	}

}
