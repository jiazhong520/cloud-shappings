package com.example.cloudshappings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CloudShappingsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudShappingsApplication.class, args);
    }
}
