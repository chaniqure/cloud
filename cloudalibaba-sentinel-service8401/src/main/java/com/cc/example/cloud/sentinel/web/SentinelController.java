package com.cc.example.cloud.sentinel.web;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cc.example.cloud.common.dto.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cc
 * @since 2020/05/31 15:36
 **/
@RestController
@RequestMapping("/sentinel")
public class SentinelController {
    @GetMapping("/byUrl")
    public R<String> byUrl() {
        return R.success("sentinel byUrl");
    }

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "byResourceHandle")
    public R<String> byResource() {
        return R.success("sentinel byResource");
    }

    public R<String> byResourceHandle(BlockException e) {
        return R.fail("fail byResourceHandle" + e.getMessage());
    }
}
