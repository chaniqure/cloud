package com.cc.example.cloud.consul.payment.web;

import com.cc.example.cloud.common.dto.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author cc
 * @since 2020/05/19 14:50
 **/
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consulInfo")
    public R<Object> consulInfo() {
        return R.success(restTemplate.getForObject("http://cloud-provider-payment/consul/info", String.class));
    }
}
