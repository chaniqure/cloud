package com.cc.example.cloud.zookeeper.web;

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

    @GetMapping("/zkinfo")
    public R<Object> zkinfo() {
        return R.success(restTemplate.getForObject("http://cloud-provider-payment/zk/info", String.class));
    }
}
