package com.jinanluke.reflect;

import com.jinanluke.reflect.bean.Phone;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射测试
 *
 * @author jinyun liu
 * @date 2020/5/1
 */
public class PrivateReflectTest {


    @Test
    public void privateTest() {
        Class<Phone> c1 = Phone.class;
        String name = c1.getName();
        try {
            Class<?> c2 = Class.forName(name);
            try {
                Constructor<?> nullConstructor = c2.getDeclaredConstructor();
                nullConstructor.setAccessible(true);
                try {
                    Object o = nullConstructor.newInstance();
                    System.out.println(o);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void attributesTest() throws Exception {
        Class<Phone> phoneClass = Phone.class;
        Field brand = phoneClass.getDeclaredField("brand");
        Constructor<?> nullConstructor = phoneClass.getDeclaredConstructor();
        nullConstructor.setAccessible(true);
        // Phone p = (Phone) nullConstructor.newInstance();
        Object p = nullConstructor.newInstance();
        brand.setAccessible(true);
        brand.set(p, "haha");
        System.out.println(p);
    }
}
