package com.jinanluke.pattern.singleton;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.TimeUnit;

/**
 * @description 单例模式
 * @author jinyun liu
 *
 * 比如某一个人，就是某一个特定的人。他永远都是他，不会出现很多个他。
 * 懒汉子，只有用到它的时候才创建对象。
 * @date 2020/4/18
 */
@ToString
public class SingletonObject2 {
    private static final String NAME = "刘津运";
    private static final String SEX = "男";
    private static final String ID_CARD_CODE = "370481199607143214";

    private static final Object monitor = new Object();

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String sex;
    @Getter
    @Setter
    private String idCardCode;

    /**
     * singleton the most dynamic feature:
     * private constructor.
     */
    private SingletonObject2() {
    }

    private SingletonObject2(String name, String sex, String idCardCode) {
        this.name = name;
        this.sex = sex;
        this.idCardCode = idCardCode;
    }

    public static SingletonObject2 object;

    public static SingletonObject2 fetchThis() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (monitor) {
            if (object == null) {
                System.out.println("initially create singletonObject2...");
                object = new SingletonObject2(NAME, SEX, ID_CARD_CODE);
            }
       }

        return object;
    }
}
