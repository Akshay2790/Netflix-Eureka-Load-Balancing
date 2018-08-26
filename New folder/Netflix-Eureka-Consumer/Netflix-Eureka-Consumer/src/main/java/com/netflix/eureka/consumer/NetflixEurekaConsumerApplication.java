package com.netflix.eureka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class NetflixEurekaConsumerApplication {

	@Autowired
	private FetchService fetchService;
	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaConsumerApplication.class, args);
	}

	@RequestMapping("/consumerService")
	public String consumerService() {
		return fetchService.firstEurekaClient();
	}
}
