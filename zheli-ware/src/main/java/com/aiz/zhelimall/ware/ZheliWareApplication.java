package com.aiz.zhelimall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZheliWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZheliWareApplication.class, args);
    }

}
