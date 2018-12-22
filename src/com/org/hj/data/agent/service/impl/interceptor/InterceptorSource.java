package com.org.hj.data.agent.service.impl.interceptor;

import com.org.hj.data.agent.service.interceptor.InterceptorSourceable;
import com.org.hj.data.agent.service.sta.Sourceable;

/**
 * Created by huajun.wang01 on 2018/12/11.
 */
public class InterceptorSource implements InterceptorSourceable {

    @Override
    public void method1() {
        System.out.println("interceptor method1");
    }

    @Override
    public void method2() {
        System.out.println("interceptor method2");
    }
}
