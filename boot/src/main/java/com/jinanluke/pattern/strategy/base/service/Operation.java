package com.jinanluke.pattern.strategy.base.service;

/**
 * 其实jdk已经定义了Function函数式接口
 * @author jinyun liu
 */
public interface Operation {
    int apply(int a, int b);
}
