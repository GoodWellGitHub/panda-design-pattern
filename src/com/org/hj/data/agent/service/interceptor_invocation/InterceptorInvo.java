package com.org.hj.data.agent.service.interceptor_invocation;

import com.org.hj.data.agent.invotication.Invocation;

/**
 * Created by huajun.wang01 on 2018/12/11.
 */
public interface InterceptorInvo {
    Object intercept(Invocation invocation);
}
