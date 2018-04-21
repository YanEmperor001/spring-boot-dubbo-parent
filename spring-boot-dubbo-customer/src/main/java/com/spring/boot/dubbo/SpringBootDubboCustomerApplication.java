package com.spring.boot.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.spring.boot.dubbo.controller"})
public class SpringBootDubboCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDubboCustomerApplication.class, args);
	}
}
