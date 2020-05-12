package arch;

import cn.hutool.core.lang.Assert;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jinanluke.ArchApplication;
import com.jinanluke.bean.ThreadPoolBuilder;
import com.jinanluke.dao.Test2Mapper;
import com.jinanluke.entity.TestDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description 测试类
 *
 * @author jinyun liu
 * @date 2020/4/2
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArchApplication.class)
public class ArchApplicationTest {
    @Resource
    private Test2Mapper test2Mapper;

    @Resource
    private ThreadPoolExecutor threadPoolExecutor;

    @Test
    public void test6() {
        int corePoolSize = threadPoolExecutor.getCorePoolSize();
        System.out.println(corePoolSize);
    }

    @Test
    public void test4() {
        ThreadPoolExecutor threadPoolExecutor = ThreadPoolBuilder.fetchExecutor();
        int corePoolSize = threadPoolExecutor.getCorePoolSize();
        System.out.println(corePoolSize);
    }

    @Test
    public void atomicIntegerTest() {
        AtomicInteger var1 = new AtomicInteger();
        log.info("new AtomicInteger()'s value is " + var1.toString());
    }

    @Test
    public void emptyListTest() {
        List<Object> list = Collections.emptyList();
        // []
        System.out.println(list);
    }

    @Test
    public void pageTest() {
        Page<TestDO> page = new Page<>(1, 10);
        page.setOrders(OrderItem.descs("id"));
        Page<TestDO> pagePage = test2Mapper.selectPage(page, null);
        Assert.notNull(pagePage, "非空");
    }

    @Test
    public void deleteTest() {
        int i = test2Mapper.deleteById(5L);
        assert i == 1;
    }
}
