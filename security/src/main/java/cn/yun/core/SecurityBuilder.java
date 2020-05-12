package cn.yun.core;

/**
 * 安全顶级构建接口
 *
 * @author jinyun liu
 * @param <T> the object built
 */
public interface SecurityBuilder<T> {

    /**
     * 构建对象
     *
     * @return the object built
     * @throws Exception if any.
     */
    T build() throws Exception;
}
