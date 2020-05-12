package com.jinanluke.pattern.strategy.base.service.impl;

import cn.hutool.core.util.StrUtil;
import com.jinanluke.pattern.strategy.base.dto.Order;
import com.jinanluke.pattern.strategy.base.dto.PayResult;
import com.jinanluke.pattern.strategy.base.service.PayNotifyService;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jinyun liu
 * @date 2020/5/5
 */
public class PayNotifyServiceImpl implements PayNotifyService {
    @Override
    public boolean executePaymentNotify(Long userId, PayResult payResult) {



        return false;
    }


    public static void main(String[] args) {
        // 安全的字符串比较 不忽略大小写
//        boolean equals = StrUtil.equals("liu", "Liu");
        // 忽略大小写
//        boolean equals2 = StrUtil.equalsIgnoreCase("liu", "LIU");
//        System.out.println(equals);
//        System.out.println(equals2);
//        Optional<PayResult>.
        // 调用链式时，常会出现空指针异常 e.g. user.getAddress().getLocation() 如果address为空就炸了
        // if(user != null){
        //    if(user.getAddress() != null){
        //      location = user.getAddress().getLocation()
        //    }
        // }
        // java8 提供了一种优雅的方式 Optional<>
        //
        //Optional
        // PayResult result1 = Objects.requireNonNull(result);

//
//        Arrays.asList("hello", "world").stream()
//                .map(k -> k.split("")).flatMap(k -> Arrays.stream(k))
//                .distinct().forEach(System.out::print);
//        result.setPayCode("1");
//        String s = Optional.ofNullable(result.getPayCode()).get();

        // avoid NPE, according to value in the Optional
        PayResult result = new PayResult();
        Order order = new Order("123");
        result.setOrder(order);

        String orderNumber = Optional.ofNullable(result)
                .map(k -> k.getOrder())
                .map(k -> k.getOrderNumber())
                .orElseThrow(() ->
                        new RuntimeException("没有拿到订单号"));

        System.out.println(orderNumber);
    }



}
