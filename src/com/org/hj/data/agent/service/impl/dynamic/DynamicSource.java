package com.org.hj.data.agent.service.impl.dynamic;

import com.org.hj.data.agent.service.dynamic.DynamicSourceable;

/**
 * Created by huajun.wang01 on 2018/12/10.
 */
public class DynamicSource implements DynamicSourceable {
    @Override
    public void method() {
        System.out.println("the orignal method !");
    }

    @Override
    public void method1() {
        System.out.println("the orignal method1 !");
    }
}
