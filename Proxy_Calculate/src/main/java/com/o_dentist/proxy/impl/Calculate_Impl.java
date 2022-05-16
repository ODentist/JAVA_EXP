package com.o_dentist.proxy.impl;

import com.o_dentist.proxy.Calculate;

public class Calculate_Impl implements Calculate {

    @Override
    public long max(long x, long y) {
        return Math.max(x, y);
    }
}
