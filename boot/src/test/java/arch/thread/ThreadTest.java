package arch.thread;

import com.jinanluke.ArchApplication;
import com.jinanluke.root.Executors;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * @author jinyun liu
 * @description 线程测试
 * @date 2020/4/3
 */
@SpringBootTest(classes = ArchApplication.class)
@RunWith(SpringRunner.class)
@Slf4j
public class ThreadTest {

    @Test
    public void initThreadTest() {
        Thread mainThread = Thread.currentThread();
        System.out.println("mainThread's name : " + mainThread.getName() + " ");

        Thread subThread = new Thread("subThread");
        System.out.println("subThread's name : " + subThread.getName());
        // lambda, new Runnable() { run(){ } }
        new Thread(() -> {
            System.out.println("我是该线程执行的任务。");
        }).start();

        //taskThread.run();
    }

    @Test
    public void functionalInterfaceTest() {
        new Executors(() -> {
            int i = 0;
            while (i <= 10) {
                ++i;
                System.out.println("我现在是：" + i);
            }
        }).execute();
    }


    @Test
    public void joinTest() {
        Thread taskThread = new Thread(() -> {
            System.out.println("Hello, I'm task thread. ------ doing. ------");

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("done, byte");
        });

        taskThread.start();
        try {
            taskThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("I' main thread, I have done my project, byte.");

        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
