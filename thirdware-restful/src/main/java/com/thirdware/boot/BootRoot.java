package com.thirdware.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages={"com.thirdware.repositories",
		"com.thirdware.controllers","com.thirdware.services","com.thirdware.aspects"})
@EnableJpaRepositories(basePackages="com.thirdware.repositories")
@EntityScan(basePackages={"com.thirdware.entity"})
@SpringBootApplication
public class BootRoot {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootRoot.class, args);
	}

}
