package com.org.hj.data.agent.plugin;

import com.org.hj.data.agent.invotication.Invocation;
import com.org.hj.data.agent.service.interceptor.Interceptor;
import com.org.hj.data.agent.service.interceptor_invocation.InterceptorInvo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by huajun.wang01 on 2018/12/13.
 */
public class Plugin implements InvocationHandler {
    private InterceptorInvo interceptor;

    public Plugin(Object object, InterceptorInvo interceptor) {
        super();
        this.interceptor = interceptor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object intercept = interceptor.intercept(new Invocation(method, args));
        System.out.println("我收到了：" + intercept);
        method.invoke(proxy,args);
        return intercept;
    }

    public static Object wrap(Object target, InterceptorInvo interceptor) {
        Class<?> type = target.getClass();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return interfaces.length > 0 ? Proxy.newProxyInstance(type.getClassLoader(), interfaces, new Plugin(target, interceptor)) : target;
    }
}
