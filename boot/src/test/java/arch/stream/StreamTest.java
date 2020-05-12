package arch.stream;

import cn.hutool.core.collection.CollUtil;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jinyun liu
 * @description
 * @date 2020/4/8
 */
public class StreamTest {
    @Test
    public void mapTest() {
        // Function mapper: Function<T,R>  -->  R apply(T).
        List<Integer> incrementList = CollUtil.newArrayList(1, 2, 3).stream().map(x -> {
            return getIncrement(x);
        }).collect(Collectors.toList());

        incrementList.forEach(x->{
            //
        });
    }


    public Integer getIncrement(Integer var1) {
        return var1++;
    }

    @Test
    public void ConsumerTest() {
        // Consumer
    }


    @Test
    public void stringTest() {
        String s = String.format("我是%s", "liu jin yun");
        System.out.println(s);
    }
}
