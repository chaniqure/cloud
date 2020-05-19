package com.cc.example.cloud.consul.web;

import com.cc.example.cloud.common.dto.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cc
 * @since 2020/05/19 14:22
 **/
@RestController
@RequestMapping("/consul")
public class ConsulController {
    @GetMapping("/info")
    public R<String> info() {
        return R.success("consul info");
    }

}
