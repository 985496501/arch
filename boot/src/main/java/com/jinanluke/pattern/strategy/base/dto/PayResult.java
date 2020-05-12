package com.jinanluke.pattern.strategy.base.dto;

import lombok.Data;

/**
 * @author jinyun liu
 * @date 2020/5/5
 */
@Data
public class PayResult {
    private String payCode;

    private Order order;
}
