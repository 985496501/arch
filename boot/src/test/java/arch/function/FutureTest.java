package arch.function;

import org.junit.Test;
import org.springframework.scheduling.annotation.AsyncResult;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @description future test
 *
 * @author jinyun liu
 * @date 2020/4/4
 */
public class FutureTest {

    @Test
    public void futureTaskTest() {
        Future<String> result = new AsyncResult<>("This is the result of asynchronous computation.");
        try {
            String s = result.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
