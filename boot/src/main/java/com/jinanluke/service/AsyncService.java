package com.jinanluke.service;

import cn.hutool.log.StaticLog;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * 异步服务（测试）
 *
 * @author jinyun liu
 */
@Service
public class AsyncService {

    @Async
    public void async() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        StaticLog.info("已经开始执行业务方法。");

        int i = 5 / 0;
    }
}
