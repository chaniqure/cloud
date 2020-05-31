package com.cc.example.cloud.nacos.config.web;

import com.cc.example.cloud.common.dto.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cc
 * @since 2020/05/28 10:36
 **/
@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Value("${config.info}")
    private String info;

    @GetMapping("/info")
    public R<String> configInfo() {
        return R.success(info);
    }
}
