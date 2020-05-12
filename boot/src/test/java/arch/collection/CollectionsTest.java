package arch.collection;

import cn.hutool.core.collection.CollUtil;
import org.junit.Test;

import java.util.*;

/**
 * @description 测试集合
 *
 * @author jinyun liu
 * @date 2020/4/11
 */
public class CollectionsTest {

    @Test
    public void setTest() {
        Set<String> set = Collections.synchronizedSet(new LinkedHashSet<>());
        ArrayList<String> str = CollUtil.newArrayList("1", "2", "0", "9");
        HashSet<String> strings = new HashSet<>(str);
        System.out.println("HashSet: " + strings);

        LinkedHashSet<String> strings1 = new LinkedHashSet<>(str);
        System.out.println("LinkedHashSet:" + strings1);

        set.add("1");
        set.add("2");
        set.add("3");
        System.out.println(set);
    }
}
