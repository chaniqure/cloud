package com.cc.example.cloud.payment.common.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cc
 * @since 2020/05/18 22:15
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private int id;
    private int price;
}
