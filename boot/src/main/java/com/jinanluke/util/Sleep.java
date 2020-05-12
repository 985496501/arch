package com.jinanluke.util;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @description 线程睡眠类
 *     专注线程睡眠
 * @author jinyun liu
 * @date 2020/4/18
 */
@Slf4j
public class Sleep {

    /**
     * 线程睡眠封装
     *
     * @param duration 睡眠时间(unit: second)
     */
    public static void done(Integer duration) {
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            log.error("{} sleep is interrupted", Thread.currentThread().getName());
        }
    }
}
