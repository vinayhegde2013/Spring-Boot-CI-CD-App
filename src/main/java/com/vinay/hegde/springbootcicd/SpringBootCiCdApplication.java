package com.vinay.hegde.springbootcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vinay.hegde")
public class SpringBootCiCdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCiCdApplication.class, args);
	}
}
