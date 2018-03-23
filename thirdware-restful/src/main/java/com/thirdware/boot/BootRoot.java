package com.thirdware.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.thirdware.repositories",
		"com.thirdware.controllers","com.thirdware.services"})
@SpringBootApplication
public class BootRoot {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootRoot.class, args);
	}

}
