package com.itheima.nacos.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Service1bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Service1bootstrap.class,args);
    }
}
