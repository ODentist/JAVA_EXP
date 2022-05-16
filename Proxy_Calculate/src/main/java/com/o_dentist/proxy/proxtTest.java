package com.o_dentist.proxy;

import com.o_dentist.proxy.impl.Calculate_Impl;

public class proxtTest {
        public static void main(String[] args){
            Calculate_Proxy calculate_proxy = new Calculate_Proxy(new Calculate_Impl());
            calculate_proxy.max(5,6);
        }
    }

