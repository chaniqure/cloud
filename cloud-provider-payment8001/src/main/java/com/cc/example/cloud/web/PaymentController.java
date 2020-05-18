package com.cc.example.cloud.web;

import com.cc.example.cloud.common.domain.Payment;
import com.cc.example.cloud.common.dto.R;
import com.cc.example.cloud.service.PaymentService;
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
}
