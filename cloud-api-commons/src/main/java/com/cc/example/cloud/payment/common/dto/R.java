package com.cc.example.cloud.payment.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cc
 * @since 2020/05/18 22:08
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R<T> {
    private int rtn;
    private String msg;
    private T data;

    public static <T> R<T> success() {
        return new R<>(0, "成功", null);
    }

    public static <T> R<T> success(T t) {
        return new R<>(0, "成功", t);
    }

    public static R<String> fail() {
        return new R<>(0, "失败", null);
    }
    public static R<String> fail(String msg) {
        return new R<>(0, msg, null);
    }
}
