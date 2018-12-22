package com.org.hj.data.test.agent.sta;

import com.org.hj.data.agent.service.impl.sta.ProxyStatic;
import com.org.hj.data.agent.service.impl.sta.Source;

/**
 * Created by huajun.wang01 on 2018/12/10.
 * 在写代理模式时，我们做的其实是面向接口编程，代理类和被代理类都实现了一个接口，这也是代理的规范写法。
 */
public class staticProxy {
    public static void main(String[] args){
        Source source=new Source();
        ProxyStatic proxyStatic =new ProxyStatic(source);
        proxyStatic.method();
    }
}
