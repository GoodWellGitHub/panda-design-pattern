package com.org.hj.data.agent.service.impl.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by huajun.wang01 on 2018/12/10.
 * 动态代理的核心接口 InvocationHandler,
 * InvocationHandler 接口只需要实现invoke方法，三个参数依次为
 * 代理对象(基本没什么用)，代理对象调用的方法，调用的方法中的参数。
 * 通过method.invoke方法，我们传入需要代理的对象（被代理对象作为DynamicProxy 的成员对象，通过构造器传入），
 * 和这个方法的参数，便可以调用被代理对象的原方法。然后其它跟静态代理没什么区别。
 * 还有一点，method.getName()可以知道被代理对象调用了什么方法，根据不同方法可以自由编写增强现有代码的功能。
 */
public class DynamicProxy implements InvocationHandler {
    Object object;

    public DynamicProxy(Object o) {
        this.object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("method1".equals(method.getName())) {
            System.out.println("before dynamicProxy!");
            method.invoke(object, args);
            System.out.println("after dynamicProxy!");
        } else if ("method".equals(method.getName())) {
            System.out.println("before dynamicProxy1");
            method.invoke(object, args);
            System.out.println("after dynamicProxy1");
        }
        return null;
    }
}
