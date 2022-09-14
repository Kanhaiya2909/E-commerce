package com.rainbowforest.recommendationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableJpaRepositories
@EnableSwagger2
public class ProductRecommendationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRecommendationServiceApplication.class, args);
	}

}
