package com.jinanluke.scenario;

import java.util.concurrent.BlockingQueue;

/**
 * @description 简单定义个生产者
 *  生产者和消费者都要继承runnable.
 *  用阻塞的队列实现生产和消费.
 *
 * @author jinyun liu
 * @date 2020/4/6
 */
public class Producer implements Runnable {
    /**
     * on-demand: initialize this value upon construction.
     */
    private final BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

    }
}
