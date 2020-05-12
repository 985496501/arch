package com.jinanluke.pattern.strategy.base.core;

/**
 * 回调的顶级接口
 * @author jinyun liu
 */
public interface CallBack<T, R> {
    /**
     * 回调参数
     * @param t
     * @return 回调的返回值
     */
    R doCallBack(T t);
}
