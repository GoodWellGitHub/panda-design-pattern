package com.org.hj.data.agent.invotication;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by huajun.wang01 on 2018/12/11.
 */
public class Invocation {
    private Method method;
    private Object[] args;

    public Invocation(Method method, Object[] args) {
        this.method = method;
        args = args;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    @Override
    public String toString() {
        return "InvocationT{" +
                "method=" + method +
                ", args=" + Arrays.toString(args) +
                '}';
    }
}
