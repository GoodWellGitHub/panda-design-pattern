package com.org.hj.data.test.agent.interceptor;

import com.org.hj.data.agent.service.impl.interceptor.DynamicProxy;
import com.org.hj.data.agent.service.impl.interceptor.InterceptorSource;
import com.org.hj.data.agent.service.interceptor.Interceptor;
import com.org.hj.data.agent.service.interceptor.InterceptorSourceable;

import java.lang.reflect.Proxy;

/**
 * Created by huajun.wang01 on 2018/12/10.
 */
public class InterceptorT {
    public static void main(String[] args) {
        InterceptorSourceable sourceable=new InterceptorSource();
        Interceptor interceptor=()->new Double(Math.random()*10).intValue();
        DynamicProxy dynamicProxy=new DynamicProxy(sourceable,interceptor);
        InterceptorSourceable sourceable1= (InterceptorSourceable)Proxy.newProxyInstance(sourceable.getClass().getClassLoader(),sourceable.getClass().getInterfaces(),dynamicProxy);
        sourceable1.method1();
        System.out.println("###############");
        sourceable1.method2();
    }
}
