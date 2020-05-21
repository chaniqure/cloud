package com.cc.example.cloud.hystrix.payment.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author cc
 * @since 2020/05/21 10:11
 **/
@Service
@Slf4j
public class PaymentService {
    public String normal(Integer id) {
        String result = Thread.currentThread().getName() + "线程传入参数：" + id + "调用成功！";
        log.info(result);
        return result;
    }

    @HystrixCommand(fallbackMethod = "timeoutHandle", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    })
    public String timeout(Integer id) {
        //int i = 1 / 0;
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = Thread.currentThread().getName() + "线程传入参数：" + id + "调用成功！";
        log.info(result);
        return result;
    }

    public String timeoutHandle(Integer id) {
        String result = Thread.currentThread().getName() + "线程传入参数：" + id + "调用失败！";
        log.info(result);
        return result;
    }

}
