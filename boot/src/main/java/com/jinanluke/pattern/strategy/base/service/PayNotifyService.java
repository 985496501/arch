package com.jinanluke.pattern.strategy.base.service;

import com.jinanluke.pattern.strategy.base.dto.PayResult;

/**
 * @author jinyun liu
 * @date 2020/5/5
 */
public interface PayNotifyService {
    /**
     * 根据用户充值或者购买的服务包，给用户 VIP 的天数 以及 抽奖的次数
     *
     * @param userId
     * @param payResult
     * @return
     */
    boolean executePaymentNotify(Long userId, PayResult payResult);
}
