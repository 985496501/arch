package arch.aop;

import com.jinanluke.other.Account;
import org.junit.Test;

/**
 * @description 切面测试
 *
 * @author jinyun liu
 * @date 2020/4/17
 */
public class AspectJTest {

    /**
     *
     *
     *
     *
     */
    @Test
    public void test2() {
        Account account = new Account();
        account.pay(2);
        System.out.println(account.getBalance());
    }
}
