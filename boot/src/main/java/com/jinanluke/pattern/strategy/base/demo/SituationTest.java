package com.jinanluke.pattern.strategy.base.demo;

import cn.hutool.core.util.StrUtil;
import com.jinanluke.pattern.strategy.base.core.OperatorFactory;
import com.jinanluke.pattern.strategy.base.service.Operation;
import org.junit.Test;

/**
 * @author jinyun liu
 * @date 2020/5/5
 */
public class SituationTest {

    enum Op {
        /**
         * +
         */
        ADD;
    }

    @Test
    public void test1() {
        int i = choiceCalculation(1, 2, "add");
        System.out.println(i);
        assert i == 3;
    }

    public int choiceCalculation(int a, int b, String op) {
        Operation invalid_operator = OperatorFactory.getOperation(op).orElseThrow(() -> new IllegalArgumentException("Invalid operator"));
        return invalid_operator.apply(a, b);
    }

    public int calculate(int a, int b, String operator) {
        // local variable must be valued. integer min value = -2*31
        // switch case 也是一样，如果以后还要家，那么判断就居多了
        int result = Integer.MIN_VALUE;

        if (StrUtil.equals("+", operator)) {
            result = a + b;
        } else if (StrUtil.equals("-", operator)) {
            result = a - b;
        } else if (StrUtil.equals("*", operator)) {
            result = a * b;
        } else if (StrUtil.equals("/", operator)) {
            result = a / b;
        }

        // replaced by this.
        choiceCalculation(a, b, Op.ADD.name());

        return result;
    }
}
