package com.cc.example.cloud.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cc
 * @since 2020/05/19 14:18
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ZkPayment8004 {
    public static void main(String[] args) {
        SpringApplication.run(ZkPayment8004.class, args);
    }
}
