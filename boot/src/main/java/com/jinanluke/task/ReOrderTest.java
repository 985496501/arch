package com.jinanluke.task;
/**
 * @description 指令重排
 * 发生指令重排的原因就是 在进行io操作的时候，CPU挂起，一直等待读取。
 * 为了提高 CPU 的工作效率 和 吞吐量， 就把CPU的执行权给别人用了。
 *
 * 防止指令重排，内存可见性，lock
 * 直接把总线锁住，is ok.
 *
 * @author jinyun liu
 * @date 2020/4/20
 */
public class ReOrderTest {
    static {
        a = 10;
    }

    private static int a = 5;

    public static void main(String[] args) {
        System.out.println(a);
    }
}
