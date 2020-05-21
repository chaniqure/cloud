package com.cc.example.cloud.hystrix.payment.web;

import com.cc.example.cloud.common.domain.Payment;
import com.cc.example.cloud.common.dto.R;
import com.cc.example.cloud.hystrix.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cc
 * @since 2020/05/21 10:13
 **/
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/normal/{id}")
    public R<String> normal(@PathVariable("id") Integer id) {
        return R.success(paymentService.normal(id));
    }

    @GetMapping("/timeout/{id}")
    public R<String> timeout(@PathVariable("id") Integer id) {
        return R.success(paymentService.timeout(id));
    }

}
