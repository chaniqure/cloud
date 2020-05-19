package com.cc.example.cloud.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cc
 * @since 2020/05/19 15:17
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulOrder80.class, args);
    }
}
