package com.soneray.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ApiGWApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGWApplication.class, args);
	}

	@Bean
	public GatewayFilter filter(){
		return new GatewayFilter();
	}
}
