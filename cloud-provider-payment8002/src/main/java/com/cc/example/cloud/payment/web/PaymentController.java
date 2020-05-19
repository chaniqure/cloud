package com.cc.example.cloud.payment.web;

import com.cc.example.cloud.common.domain.Payment;
import com.cc.example.cloud.common.dto.R;
import com.cc.example.cloud.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @author cc
 * @since 2020/05/18 22:02
 **/
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private int port;
    @PostMapping("/create/payment")
    public R<Payment> createPayment(@RequestBody Payment payment) {
        return R.success(paymentService.createPayment(payment));
    }

    @GetMapping("/get/{id}")
    public R<Payment> getPayment(@PathVariable("id") int id) {
        return R.success(paymentService.getPayment(id));
    }

    @GetMapping("/test")
    public R<Integer> test() {
        return R.success(port);
    }

    @GetMapping("/feign")
    public R<Integer> feign(Integer id) {
        return R.success(id);
    }

    @GetMapping("/feign/timeout")
    public R<Integer> feignTimeOut() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return R.success();
    }
}
