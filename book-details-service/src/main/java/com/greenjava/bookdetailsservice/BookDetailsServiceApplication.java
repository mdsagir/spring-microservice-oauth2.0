package com.greenjava.bookdetailsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.greenjava.bookdetailsservice")
@EnableResourceServer
public class BookDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookDetailsServiceApplication.class, args);
	}

}
