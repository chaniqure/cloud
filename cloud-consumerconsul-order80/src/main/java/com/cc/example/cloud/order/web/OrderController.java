package com.cc.example.cloud.order.web;

import com.cc.example.cloud.common.dto.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author cc
 * @since 2020/05/19 10:15
 **/
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public R<String> test() {
        R<String> result = restTemplate.getForObject("http://cloud-provider-payment8001/payment/test", R.class);
        return R.success(result.getData());
    }
}
