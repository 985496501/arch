package arch.pattern;

import com.jinanluke.inter.ITitle;
import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @description interface provider service
 *
 * @author jinyun liu
 * @date 2020/4/11
 */
public class IPSTest {

    @Test
    public void serviceTest() {
        // we generally use java.util.ServiceLoader
        ServiceLoader<ITitle> titles = ServiceLoader.load(ITitle.class);
        Iterator<ITitle> iterator = titles.iterator();
        while (iterator.hasNext()) {
            ITitle title = iterator.next();
            title.getName();
        }
    }
}
