package com.alticci.alticci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class AlticciApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlticciApplication.class, args);
	}

}
