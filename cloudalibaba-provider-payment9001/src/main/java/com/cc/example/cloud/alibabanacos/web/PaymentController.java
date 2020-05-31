package com.cc.example.cloud.alibabanacos.web;

import com.cc.example.cloud.common.dto.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cc
 * @since 2020/05/28 10:58
 **/
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Value("${server.port}")
    private int port;

    @GetMapping("/test")
    public R<Integer> test() {
        return R.success(port);
    }
}
