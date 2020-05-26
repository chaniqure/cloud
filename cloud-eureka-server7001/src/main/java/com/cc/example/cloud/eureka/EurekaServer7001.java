package com.cc.example.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cc
 * @since 2020/05/18 22:36
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001 {
    private static int a ;
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001.class, args);
    }
}
