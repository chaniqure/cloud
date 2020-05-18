package com.cc.example.common;

import lombok.Data;

/**
 * @author cc
 * @since 2020/05/18 22:08
 **/
@Data
public class R<T> {
    private int rtn;
    private String msg;
    private T data;
}
