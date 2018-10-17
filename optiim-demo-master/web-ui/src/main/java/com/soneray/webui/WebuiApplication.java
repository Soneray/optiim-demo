package com.soneray.webui;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.soneray.webui.domain.Account;
import com.soneray.webui.domain.Product;

@SpringBootApplication
public class WebuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebuiApplication.class, args);
	}

}
