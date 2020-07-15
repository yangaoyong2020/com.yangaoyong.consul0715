package com.yangaoyong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Start1 {
    public static void main(String[] args) {
        SpringApplication.run(Start1.class);
    }
}
