package com.aiz.zhelimall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZheliProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZheliProductApplication.class, args);
    }

}
