package com.cc.example.cloud.hystrix.order.service.impl;

import com.cc.example.cloud.common.dto.R;
import com.cc.example.cloud.hystrix.order.service.OrderHystrixFeignClient;
import org.springframework.stereotype.Service;

/**
 * @author cc
 * @since 2020/05/21 19:52
 **/
@Service
public class OrderHystrixFeignCommonClientImpl implements OrderHystrixFeignClient {
    @Override
    public R<String> normal(Integer id) {
        return null;
    }

    @Override
    public R<String> timeout(Integer id) {
        return null;
    }

    @Override
    public R<String> common(Integer id) {
        return R.fail("common调用失败，启用impl默认实现");
    }

    @Override
    public R<String> common1(Integer id) {
        return R.fail("common1调用失败，启用impl默认实现");
    }
}
