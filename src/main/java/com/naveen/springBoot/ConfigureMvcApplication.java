package com.naveen.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"demo","controller"})
public class ConfigureMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigureMvcApplication.class, args);
	}
}
