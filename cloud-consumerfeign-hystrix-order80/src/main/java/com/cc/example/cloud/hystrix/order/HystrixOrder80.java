package com.cc.example.cloud.hystrix.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author cc
 * @since 2020/05/21 10:22
 **/
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class HystrixOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixOrder80.class, args);
    }
}
