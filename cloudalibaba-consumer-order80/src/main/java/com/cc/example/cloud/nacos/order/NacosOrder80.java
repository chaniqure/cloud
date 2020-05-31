package com.cc.example.cloud.nacos.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author cc
 * @since 2020/05/28 11:03
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrder80.class, args);
    }
}
