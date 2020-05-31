package com.cc.example.cloud.nacos.order.service;

import com.cc.example.cloud.common.dto.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author cc
 * @create 2020/05/28 11:05
 **/
@FeignClient("alibabacloud-provider-payment")
@Component
public interface OrderFeignClient {
    @GetMapping("/payment/test")
    R<Integer> test();
}
