package com.cc.example.cloud.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cc
 * @since 2020/05/19 15:18
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPayment8006 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulPayment8006.class, args);
    }
}
