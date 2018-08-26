package com.netflix.eureka.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class NetflixEurekaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaClient2Application.class, args);
	}
	

	@RequestMapping("/firstEurekaClient")
    public String firstEurekaClient() {
        return "Welcome first EurekaClient! Second Instance";
    }
}

