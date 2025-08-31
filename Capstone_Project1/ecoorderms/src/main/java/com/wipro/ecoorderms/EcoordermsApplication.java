package com.wipro.ecoorderms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.wipro.ecoorderms.client")

public class EcoordermsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcoordermsApplication.class, args);
	}

}
