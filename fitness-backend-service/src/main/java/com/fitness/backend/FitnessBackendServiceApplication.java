package com.fitness.backend;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FitnessBackendServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitnessBackendServiceApplication.class, args);
    }

}
