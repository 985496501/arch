package com.jinanluke.annotation;

import java.lang.annotation.*;

/**
 * 字段过滤注解
 *
 * @author jinyun liu
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FieldFilter {
    String name();

    int value() default 1;
}
