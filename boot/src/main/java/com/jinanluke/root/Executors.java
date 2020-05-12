package com.jinanluke.root;

/**
 * @author jinyun liu
 * @description 执行器群
 * @date 2020/4/3
 */
public class Executors {

    private ExecutorManager manager;

    public Executors(ExecutorManager executorManager) {
        this.manager = executorManager;
    }

    public void execute() {
        if (manager != null) {
            manager.execute();
        }
    }
}
