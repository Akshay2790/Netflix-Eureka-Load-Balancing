package com.netflix.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class NetflixEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaClientApplication.class, args);
	}
	
	@RequestMapping("/firstEurekaClient")
    public String firstEurekaClient() {
        return "Welcome first EurekaClient!";
    }
}
