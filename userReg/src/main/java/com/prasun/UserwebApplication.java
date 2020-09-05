package com.prasun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class UserwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserwebApplication.class, args);
	}

}
