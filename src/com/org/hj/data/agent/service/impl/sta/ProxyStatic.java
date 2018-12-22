package com.org.hj.data.agent.service.impl.sta;

import com.org.hj.data.agent.service.sta.Sourceable;

/**
 * Created by huajun.wang01 on 2018/12/10.
 */
public class ProxyStatic implements Sourceable {
    public Source source;

    public ProxyStatic(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before proxy !");
        source.method();
        System.out.println("after proxy !");
    }
}
