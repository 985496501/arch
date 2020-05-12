package arch.function;

import cn.hutool.core.collection.CollUtil;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;


/**
 * @description predicate means what to do.
 * 谓词，定义动作的接口, assert.
 *
 * @author jinyun liu
 * @date 2020/4/8
 */
public class PredicateTest {
    @Test
    public void predictRecognized() {
        // filter: Predicate.  a functional method: boolean test(T t);
        List<String> list = CollUtil.newArrayList("aa", "bb", "abs").stream()
                .filter(k -> k.contains("a")).collect(Collectors.toList());

        System.out.println(list);
    }
}
