package com.jinanluke.bean;

import org.springframework.stereotype.Service;

import java.util.concurrent.*;

/**
 * @author jinyun liu
 * @description 线程池配置
 * @date 2020/4/18
 */
@Service
public class ThreadPoolBuilder {
    private static final Integer CORE_POOL_SIZE = 10;
    private static final Integer MAXIMUM_POOL_SIZE = 20;
    private static final Long KEEP_ALIVE_TIME = 2L;
    private static final TimeUnit UNIT = TimeUnit.MINUTES;
    private static final BlockingQueue QUEUE = new ArrayBlockingQueue(10);
    private static final ThreadFactory FACTORY = Executors.defaultThreadFactory();

    private ThreadPoolBuilder() {
    }

    private static ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
            CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, KEEP_ALIVE_TIME,
            UNIT, QUEUE, FACTORY);

    public static ThreadPoolExecutor fetchExecutor() {
        return poolExecutor;
    }
}
