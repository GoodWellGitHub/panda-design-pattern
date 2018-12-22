package com.org.hj.data.test.agent.dynamic;

import com.org.hj.data.agent.service.dynamic.DynamicSourceable;
import com.org.hj.data.agent.service.impl.dynamic.DynamicProxy;
import com.org.hj.data.agent.service.impl.dynamic.DynamicSource;

import java.lang.reflect.Proxy;

/**
 * Created by huajun.wang01 on 2018/12/10.
 * 动态代理 相比较 静态代理 相同点在于都是面向接口编程，都不破坏原有代码而增强功能，
 * 不同点在于 动态代理不需要自己写代理类，也就免去了很多因为自己写代理类而带来的问题。
 * 在spring大名鼎鼎的aop特性中，Spring提供了两种方式来生成代理对象: JDKProxy和Cglib，
 * 默认的策略是如果目标类是接口，则使用JDKProxy，JDKProxy便是我们所说的动态代理，否则使用Cglib来生成代理。
 * 所以说代理模式不是空中楼阁，对于减少代码重复量，减少代码冗余有很多实际的用处。
 */
public class DynamicProxySource {
    public static void main(String[] args) throws Exception {
        DynamicSourceable sourceable = new DynamicSource();
        DynamicProxy proxy = new DynamicProxy(sourceable);
        DynamicSourceable dynamicSourceable = (DynamicSourceable) Proxy.newProxyInstance
                (sourceable.getClass().getClassLoader(), sourceable.getClass().getInterfaces(), proxy);
        dynamicSourceable.method();
        System.out.println("#########################");
        dynamicSourceable.method1();
    }
}
