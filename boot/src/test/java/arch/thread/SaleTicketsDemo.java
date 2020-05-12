package arch.thread;

import java.util.concurrent.TimeUnit;

/**
 * 多个窗口买票的问题
 * 4个窗口同时卖 200张票
 * 我们一般的思维就是这么写的。
 *
 * @author jinyun liu
 * @date 2020/4/18
 */
public class SaleTicketsDemo {
    /**
     * 定义全局变量，一共有200张票
     */
    private static int ticketsCapacity = 200;

    // private final Object monitor = new Object();

    /**
     * 卖票
     */
    public synchronized void saleTicket() {
        while (ticketsCapacity > 0) {
//            try {
//                TimeUnit.MILLISECONDS.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            System.out.println(String.format("%s: 还有%d张票。", Thread.currentThread().getName(), ticketsCapacity));

            ticketsCapacity = ticketsCapacity - 1;
        }
    }


    public static void main(String[] args) {
        SaleTicketsDemo seller = new SaleTicketsDemo();


        //long startTime = System.currentTimeMillis();

        for (int i = 0; i < 4; ++i) {
            new Thread(() -> {
                seller.saleTicket();
            }, String.format("我是%d号窗口", i + 1)).start();
        }

//        long l = System.currentTimeMillis() - startTime;
//        System.out.println(String.format("-------------- 总共消耗了%d ----------------", l));

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("*******  " + ticketsCapacity + "  **********");
    }
}
