package com.org.hj.data.agent.service.impl.interceptor;

import com.org.hj.data.agent.service.interceptor.Interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by huajun.wang01 on 2018/12/10.
 */
public class DynamicProxy implements InvocationHandler {
    private Interceptor interceptor;

    public DynamicProxy(Object object, Interceptor interceptor) {
        super();
        this.interceptor = interceptor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object intercept = interceptor.intercept();
        System.out.println("我到了 " + intercept);
        return intercept;
    }
}
