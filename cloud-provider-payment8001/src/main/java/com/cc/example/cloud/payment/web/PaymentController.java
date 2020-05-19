package com.cc.example.cloud.payment.web;

import com.cc.example.cloud.payment.common.domain.Payment;
import com.cc.example.cloud.payment.common.dto.R;
import com.cc.example.cloud.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author cc
 * @since 2020/05/18 22:02
 **/
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping("/create/payment")
    public R<Payment> createPayment(@RequestBody Payment payment) {
        return R.success(paymentService.createPayment(payment));
    }

    @GetMapping("/get/{id}")
    public R<Payment> getPayment(@PathVariable("id") int id) {
        return R.success(paymentService.getPayment(id));
    }

    @GetMapping("/test")
    public R<String> test() {
        return R.success();
    }
}
