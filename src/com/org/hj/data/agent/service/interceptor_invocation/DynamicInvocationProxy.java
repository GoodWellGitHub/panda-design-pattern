package com.org.hj.data.agent.service.interceptor_invocation;

import com.org.hj.data.agent.invotication.Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by huajun.wang01 on 2018/12/11.
 */
public class DynamicInvocationProxy implements InvocationHandler {
    private InterceptorInvo interceptorInvo;

    public DynamicInvocationProxy(Object object, InterceptorInvo interceptorInvo) {
        super();
        this.interceptorInvo = interceptorInvo;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object intercept = interceptorInvo.intercept(new Invocation(method, args));
        System.out.println("我收到了：" + intercept);
        return intercept;
    }
}
