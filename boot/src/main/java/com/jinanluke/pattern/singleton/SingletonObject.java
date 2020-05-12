package com.jinanluke.pattern.singleton;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description 单例模式
 *  比如某一个人，就是某一个特定的人。他永远都是他，不会出现很多个他。
 *  饿汉子，直接就生成对象准备着。
 *
 * @author jinyun liu
 * @date 2020/4/18
 */
@ToString
public class SingletonObject {
    private static final String NAME = "刘津运";
    private static final String SEX = "男";
    private static final String ID_CARD_CODE = "370481199607143214";

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
    private SingletonObject(){ }

    private SingletonObject(String name, String sex, String idCardCode) {
        this.name = name;
        this.sex = sex;
        this.idCardCode = idCardCode;
    }

    private static SingletonObject object = new SingletonObject(NAME, SEX, ID_CARD_CODE);

    public static SingletonObject fetchThis() {
        return object;
    }
}
