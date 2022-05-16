package com.o_dentist.proxy;

import com.o_dentist.proxy.impl.Calculate_Impl;

import java.util.logging.*;
public class Calculate_Proxy {
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private Calculate calculate;

    public Calculate_Proxy(Calculate calculate) {
        this.calculate = calculate;
    }

    private void log(String msg){
        logger.log(Level.INFO,msg);
    }

    public void max(long x,long y) {
        log("hello method starts…");             // 日志服务
        calculate.max(x,y);      // 执行业务逻辑
        log("hello method ends…");             // 日志服务
    }
}
