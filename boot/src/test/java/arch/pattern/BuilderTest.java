package arch.pattern;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;
import com.jinanluke.dto.UtilityDTO;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @description builder pattern
 *
 * @author jinyun liu
 * @date 2020/4/4
 */
public class BuilderTest {

    @Test
    public void builderTest() {
        UtilityDTO dto = UtilityDTO.builder().result("message...").build();
        System.out.println(JSONUtil.parse(dto).toStringPretty());
    }

    @Test
    public void printArray() {
        ArrayList<String> strings = CollUtil.newArrayList("1324356", "4135613");
        System.out.println(strings.toString());
    }
}
