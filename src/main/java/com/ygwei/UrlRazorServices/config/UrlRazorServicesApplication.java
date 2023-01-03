package com.ygwei.UrlRazorServices.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ygwei")
public class UrlRazorServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrlRazorServicesApplication.class, args);
	}

}
