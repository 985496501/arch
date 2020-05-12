package com.jinanluke.atomic;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author jinyun liu
 * @date 2020/5/1
 */
public class AtomicTest {
    @Test
    public void booleanTest() {
        // default-value: false
        AtomicBoolean a = new AtomicBoolean();

        if (a.compareAndSet(false, true)) {
            System.out.println(a);
        }
        else{
            System.out.println(1);
        }
    }
}
