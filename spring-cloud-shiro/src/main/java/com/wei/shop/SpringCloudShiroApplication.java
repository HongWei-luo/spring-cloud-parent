package com.wei.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudShiroApplication.class, args);
    }

}
