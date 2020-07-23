package com.aiz.zhelimall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.aiz.zhelimall.ware.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class ZheliWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZheliWareApplication.class, args);
    }

}
