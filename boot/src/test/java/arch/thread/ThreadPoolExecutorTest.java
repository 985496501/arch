package arch.thread;

import com.jinanluke.ArchApplication;
import com.jinanluke.task.Task;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description threadPool executor to create threadPool
 *
 * @author jinyun liu
 * @date 2020/4/6
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArchApplication.class)
public class ThreadPoolExecutorTest {
    @Resource
    private Task task;

    @Resource
    private ThreadPoolExecutor threadPoolExecutor;

    @Test
    public void threadPoolExecutorTest() {
        // 异步执行所有任务方法，有返回值的。
       // threadPoolExecutor.invokeAll();
    }


    @Test
    public void atomicIntegerTest() {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        int andIncrement = atomicInteger.getAndIncrement();
        System.out.println("previous value: " + andIncrement);

        int andIncrement2 = atomicInteger.getAndIncrement();
        System.out.println("perform twice value: " + andIncrement);
    }

    @Test
    private void threadPoolTaskExecutorsTest() {
        // spring thread pool executor embedded.
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    }
    
}
