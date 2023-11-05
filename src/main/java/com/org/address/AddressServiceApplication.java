package com.org.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.org.address.repository","com.org.address.modal"})
@ComponentScan(basePackages = {"com.org.address.controller","com.org.address.service"})
public class AddressServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(AddressServiceApplication.class, args);
	}
}
