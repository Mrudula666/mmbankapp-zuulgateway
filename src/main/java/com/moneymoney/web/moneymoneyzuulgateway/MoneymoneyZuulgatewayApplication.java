package com.moneymoney.web.moneymoneyzuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MoneymoneyZuulgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneymoneyZuulgatewayApplication.class, args);
	}
}