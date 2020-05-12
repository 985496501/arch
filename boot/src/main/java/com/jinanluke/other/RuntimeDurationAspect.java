package com.jinanluke.other;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author jinyun liu
 * @description 方法运行周期的切面
 * @date 2020/4/17
 */
@Aspect
public class RuntimeDurationAspect {
    /**
     * '*'匹配任何部分，只能表示一个单词
     * .. 用于全限定名中和方法参数中，分别表示子包和 0-n的参数
     * execution(): 用于匹配方法执行的连接点
     * <p>
     * the execution of any public method:
     * ret_type-pattern, name-pattern, ..param-pattern.
     * 表示任何方法, 不限定方法名称，返回值，参数。
     * execution(public * *(..))
     * <p>
     * the execution of any method with a name beginning with "set":
     * 不限定返回值，已set开头的方法，不限参数
     * execution(* set*(..))
     * <p>
     * the execution of any method defined by the AccountService interface:
     * 不限定返回值，这个src路径下的accountService包的所有方法。
     * execution(* com.xyz.service.AccountService.*(..))//常用
     * <p>
     * the execution of any method defined in the service package:
     * 包内的所有*一个单词, service包下的子包的所有方法
     * execution(* com.xyz.service.*.*(..))//常用
     * <p>
     * the execution of any method defined in the service package or a sub-package:
     * service下的任意子包，
     * execution(* com.xyz.service..*.*(..))//常用
     */
    @Pointcut(value = "execution(* com.jinanluke.other.Account.*(..))")
    public void pointCut() {
    }

    public Object logProfile(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        System.out.println(System.currentTimeMillis() - start);
        return proceed;
    }
}
