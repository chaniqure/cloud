package com.cc.example.cloud.feign.web;

import com.cc.example.cloud.common.dto.R;
import com.cc.example.cloud.feign.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cc
 * @since 2020/05/19 22:14
 **/
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/feign")
    public R<Integer> feign(Integer id) {
        return orderService.feign(id);
    }

    @GetMapping("/timeout")
    public R<Integer> timeout() {
        return orderService.feignTimeOut();
    }

    @GetMapping("/test")
    public R<Integer> test() {
        return orderService.test();
    }
}
