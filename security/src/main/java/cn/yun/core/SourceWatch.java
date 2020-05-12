package cn.yun.core;

import org.junit.Test;
import org.springframework.security.config.annotation.AbstractSecurityBuilder;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.FilterChainProxy;

/**
 * @description 查看源码
 *
 * @author jinyun liu
 * @date 2020/5/1
 */
public class SourceWatch {

    @Test
    public void test() {
        FilterChainProxy filterChainProxy = new FilterChainProxy();

        // return the reference.
        String name = SourceWatch.class.getName().concat(".applied");
        System.out.println(name);

        WebSecurityConfiguration webSecurityConfiguration = new WebSecurityConfiguration();

        AbstractSecurityBuilder builder = new WebSecurity(new ObjectPostProcessor<Object>() {
            @Override
            public <O> O postProcess(O object) {
                return null;
            }
        });
    }
}
