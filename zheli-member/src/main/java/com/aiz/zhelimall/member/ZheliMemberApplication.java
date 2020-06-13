package com.aiz.zhelimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZheliMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZheliMemberApplication.class, args);
    }

}
