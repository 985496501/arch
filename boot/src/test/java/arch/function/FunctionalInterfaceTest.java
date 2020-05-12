package arch.function;

import com.jinanluke.ArchApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

/**
 * @author jinyun liu
 * @description 函数式接口测试
 * @date 2020/4/4
 */
@SpringBootTest(classes = ArchApplication.class)
@RunWith(SpringRunner.class)
@Slf4j
public class FunctionalInterfaceTest {

    // functional test delay.
    @Test
    public void baseTest() {
        // Supplier<AssetDO>
    }


    @Test
    public void futureInterfaceTest() {
        // Future<>
    }
}
