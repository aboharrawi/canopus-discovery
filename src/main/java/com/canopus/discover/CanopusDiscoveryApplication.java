package com.canopus.discover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CanopusDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CanopusDiscoveryApplication.class, args);
    }

}
