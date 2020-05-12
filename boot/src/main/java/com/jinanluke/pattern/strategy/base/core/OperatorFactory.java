package com.jinanluke.pattern.strategy.base.core;

import com.jinanluke.pattern.strategy.base.service.Operation;
import com.jinanluke.pattern.strategy.base.service.impl.Addition;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author jinyun liu
 * @date 2020/5/5
 */
public class OperatorFactory {
    static Map<String, Operation> opMap = new HashMap<>();

    static {
        opMap.put("add", new Addition());
    }

    public static Optional<Operation> getOperation(String operator) {
        return Optional.ofNullable(opMap.get(operator));
    }
}
