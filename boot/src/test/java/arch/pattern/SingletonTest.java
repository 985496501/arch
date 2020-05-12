package arch.pattern;

import com.jinanluke.pattern.singleton.SingletonObject;
import com.jinanluke.pattern.singleton.SingletonObject2;
import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author jinyun liu
 * @description 单例模式设计
 * @date 2020/4/18
 */
public class SingletonTest {
    private static final Integer CORE_POOL_SIZE = 2;
    private static final Integer MAXIMUM_POOL_SIZE = 10;
    private static final Long KEEP_ALIVE_TIME = 2L;
    private static final TimeUnit UNIT = TimeUnit.MINUTES;
    private static final BlockingQueue QUEUE = new ArrayBlockingQueue(10);

    private ThreadPoolExecutor executor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, KEEP_ALIVE_TIME, UNIT, QUEUE);

    public SingletonTest() {
        // pre-initialize the core thread.
        executor.prestartCoreThread();
    }

    @Test
    public void singleton1() {
        SingletonObject object = SingletonObject.fetchThis();
        SingletonObject singletonObject = SingletonObject.fetchThis();
        boolean equals = object.equals(singletonObject);
        System.out.println(equals);
    }

    @Test
    public void singleton2() {
//        Collections.addAll();
//        try {
////            List<Future<T>> futures = executor.invokeAll(new LinkedList<Callable>());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Future<Object> submit = executor.submit(() -> {
            SingletonObject2.fetchThis();
        }, new Object());
        Future<Object> submit2 = executor.submit(() -> {
            SingletonObject2.fetchThis();
        }, new Object());

        // multiple-core CPU to perform the task almost synchronously.

        try {
            Object o = submit.get();
            Object o1 = submit2.get();

            System.out.println(o);
            System.out.println(o1);

            System.out.println(o.equals(o1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }



    @Test
    public void test6() {
        for (int i = 0; i < 2; i++) {
            executor.execute(() -> {
                SingletonObject2 obj = SingletonObject2.fetchThis();
                System.out.println(obj);
            });
        }

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    @Test
    public void test3() {
        SingletonObject2 o1 = SingletonObject2.fetchThis();
        SingletonObject2 o2 = SingletonObject2.fetchThis();
        System.out.println(o1.equals(o2));
    }



    @Test
    public void test4() {
        for (int i = 0; i < 10; i++) {
            singleton2();
        }
    }
}
