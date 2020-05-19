package com.cc.example.cloud.feign.service;

import com.cc.example.cloud.common.dto.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author cc
 * @since 2020/05/19 22:15
 **/
@FeignClient("cloud-provider-payment")
@Component
public interface OrderService {
    @GetMapping("/payment/feign")
    R<Integer> feign(@RequestParam("id") Integer id);

    @GetMapping("/payment/test")
    R<Integer> test();

    @GetMapping("/payment/feign/timeout")
    R<Integer> feignTimeOut();
}
