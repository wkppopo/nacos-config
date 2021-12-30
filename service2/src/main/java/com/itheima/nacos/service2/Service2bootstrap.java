package com.itheima.nacos.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class Service2bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Service2bootstrap.class,args);
    }
}
