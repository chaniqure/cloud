package com.cc.example.cloud.hystrix.order.web;

import com.cc.example.cloud.common.dto.R;
import com.cc.example.cloud.hystrix.order.service.OrderHystrixFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cc
 * @since 2020/05/21 10:24
 **/
@RestController
@RequestMapping("/order")
@DefaultProperties(defaultFallback = "globalHandler")
public class OrderController {
    @Autowired
    private OrderHystrixFeignClient orderHystrixFeignClient;


    @GetMapping("/normal/{id}")
    public R<String> normal(@PathVariable("id") Integer id) {
        return orderHystrixFeignClient.normal(id);
    }

    @GetMapping("/timeout/{id}")
    @HystrixCommand(fallbackMethod = "timeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2500")
    })
    public R<String> timeout(@PathVariable("id") Integer id) {
        //int i = 1 / 0;
        return orderHystrixFeignClient.timeout(id);
    }

    @GetMapping("/common/{id}")
    //@HystrixCommand
    public R<String  > common(@PathVariable("id") Integer id) {
        //int i = 1 / 0;
        return orderHystrixFeignClient.common(id);
    }

    @GetMapping("/common1/{id}")
    @HystrixCommand
    public R<String> common1(@PathVariable("id") Integer id) {
        //int i = 1 / 0;
        return orderHystrixFeignClient.common1(id);
    }

    @GetMapping("/global/{id}")
    @HystrixCommand
    public R<String> global(@PathVariable("id") Integer id) {
        return orderHystrixFeignClient.timeout(id);
    }

    public R<String> timeoutHandler(Integer id) {
        return R.fail("服务端超时或报错，客户端保留处理");
    }

    public R<String> globalHandler() {
        return R.fail("全局异常处理");
    }
}
