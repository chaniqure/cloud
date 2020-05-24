package com.cc.example.cloud.hystrix.order.service;

import com.cc.example.cloud.common.dto.R;
import com.cc.example.cloud.hystrix.order.service.impl.OrderHystrixFeignCommonClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author cc
 * @create 2020/05/21 10:26
 **/
@Service
@FeignClient(value = "cloud-provider-hystrix-payment8001", fallback = OrderHystrixFeignCommonClientImpl.class )
public interface OrderHystrixFeignClient {
    @GetMapping("/payment/normal/{id}")
    R<String> normal(@PathVariable("id") Integer id);

    @GetMapping("/payment/timeout/{id}")
    R<String> timeout(@PathVariable("id") Integer id);

    @GetMapping("/payment/timeout/{id}")
    R<String> common(@PathVariable("id") Integer id);

    @GetMapping("/payment/timeout/{id}")
    R<String> common1(@PathVariable("id") Integer id);
}
