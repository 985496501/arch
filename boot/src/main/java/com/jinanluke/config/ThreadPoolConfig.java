package com.jinanluke.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.*;

/**
 * @description 线程池配置
 *
 * @author jinyun liu
 * @date 2020/4/18
 */
@Configuration
public class ThreadPoolConfig {
    private static final Integer CORE_POOL_SIZE = 15;
    private static final Integer MAXIMUM_POOL_SIZE = 20;
    private static final Long KEEP_ALIVE_TIME = 2L;
    private static final TimeUnit UNIT = TimeUnit.MINUTES;
    private static final BlockingQueue QUEUE = new ArrayBlockingQueue(10);
    private static final ThreadFactory FACTORY = Executors.defaultThreadFactory();

    /**
     * 组装线程池对象交给spring统一管理
     *
     * @return threadPoolExecutor
     */
    @Bean
    public ThreadPoolExecutor threadPoolExecutor() {
        return new ThreadPoolExecutor(
                CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, KEEP_ALIVE_TIME,
                UNIT, QUEUE, FACTORY);
    }
}
