package com.cc.example.cloud.config.web;

import com.cc.example.cloud.common.dto.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cc
 * @since 2020/05/27 11:09
 **/
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {
    @Value(("${test.name}"))
    private String info;
    @GetMapping("/info")
    public R<String> configInfo() {
        return R.success(info);
    }
}
