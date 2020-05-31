package com.cc.example.cloud.nacos.order.web;

import com.cc.example.cloud.common.dto.R;
import com.cc.example.cloud.nacos.order.service.OrderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cc
 * @since 2020/05/28 11:05
 **/
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderFeignClient orderFeignClient;

    @GetMapping("/test")
    public R<Integer> test() {
        return orderFeignClient.test();
    }
}
