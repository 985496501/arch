package arch.thread;

import java.util.concurrent.TimeUnit;

/**
 *  基础线程问题
 *  synchronized: 重量级锁，保证统一时刻，被修饰的方法只有一个对象访问
 *  同步函数： this, 同步锁
 *  同步静态方法：Class.class 字节码文件对象
 *
 *  同步代码块可以使用任意锁。建议使用同步代码块。
 *  It's strongly recommended that use sync block.
 *  For example:
 *      synchronized(lock) {
 *          operation...
 *      }
 *
 *  sleep: 释放cpu的执行权，但是不释放锁
 *
 *
 * @author jinyun liu
 * @date 2020/4/17
 */
public class BasicThread {
    /**
     * shared resource.
     */
    public static int i = 0;

    /**
     * define a sync monitor
     */
    public final Object synchronizedMonitor = new Object();

    /**
     * operate the shared resource.
     */
    public void autoIncrement() {
//        synchronized (synchronizedMonitor) {
//            i--;
//        }
        i --;
    }

    public static void main(String[] args) {
        BasicThread basicThread = new BasicThread();
        new Thread(() -> {
            for (int k = 0; k < 4; k++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                basicThread.autoIncrement();
                System.out.println(String.format("Thread-Name: %s finished auto increment. i = %d", Thread.currentThread().getName(), i));
            }
        }, "thread1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(() -> {
            for (int k = 0; k < 4; k++) {
                basicThread.autoIncrement();
                System.out.println(String.format("Thread-Name: %s finished auto increment. i = %d", Thread.currentThread().getName(), i));
            }
        }, "thread2").start();


        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
