package com.cc.example.cloud.service;

import cn.hutool.core.util.RandomUtil;
import com.cc.example.cloud.common.domain.Payment;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author cc
 * @since 2020/05/18 22:22
 **/
@Service
public class PaymentService {
    Map<Integer, Payment> payments = Maps.newHashMap();

    public Payment createPayment(Payment payment) {
        payment.setId(RandomUtil.randomInt());
        payments.put(payment.getId(), payment);
        return payment;
    }

    public Payment getPayment(int id) {
        return payments.get(id);
    }
}
