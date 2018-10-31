package com.udea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceRegistrationApplication.class, args);
	}
}
