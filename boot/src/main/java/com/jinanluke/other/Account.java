package com.jinanluke.other;

import lombok.Getter;

/**
 * @description 模拟余额类
 *
 * @author jinyun liu
 * @date 2020/4/17
 */
public class Account {
    @Getter
    private int balance = 10;

    public boolean pay(int amount) {
        if (balance < amount) {
            return false;
        }

        balance -= amount;
        return true;
    }
}
