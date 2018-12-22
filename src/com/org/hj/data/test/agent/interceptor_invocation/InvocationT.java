package com.org.hj.data.test.agent.interceptor_invocation;

import com.org.hj.data.agent.service.dynamic.DynamicSourceable;
import com.org.hj.data.agent.service.impl.dynamic.DynamicSource;
import com.org.hj.data.agent.service.interceptor_invocation.DynamicInvocationProxy;
import com.org.hj.data.agent.service.interceptor_invocation.InterceptorInvo;
import com.org.hj.data.agent.service.sta.Sourceable;

import java.lang.reflect.Proxy;

/**
 * Created by huajun.wang01 on 2018/12/12.
 */
public class InvocationT {
    public static void main(String[] args){
        DynamicSourceable sourceable=new DynamicSource();
        //Invocation invocation=new Invocation();
        InterceptorInvo vo=(invocation)->{
            System.out.println("invocation: "+invocation.toString());
            return new Double(Math.random()*10).intValue();
        };
        DynamicInvocationProxy proxy=new DynamicInvocationProxy(sourceable,vo);
        Sourceable source=(Sourceable) Proxy.newProxyInstance(sourceable.getClass().getClassLoader(),sourceable.getClass().getInterfaces(),proxy);
        sourceable.method();
        System.out.println("############");
    }
}
