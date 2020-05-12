package com.jinanluke.pattern.strategy.base.service.impl;

import com.jinanluke.pattern.strategy.base.service.Operation;

/**
 * @author jinyun liu
 * @date 2020/5/5
 */
public class Addition implements Operation {

    @Override
    public int apply(int a, int b) {
        return a + b;
    }
}
