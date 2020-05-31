package com.cc.example.cloud.nacos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cc
 * @since 2020/05/28 10:35
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClient3001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClient3001.class, args);
    }
}
