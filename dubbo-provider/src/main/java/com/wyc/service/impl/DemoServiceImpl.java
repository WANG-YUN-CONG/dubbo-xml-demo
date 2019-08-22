package com.wyc.service.impl;

import com.wyc.service.DemoService;

/**
 * @program: dubbo-parent
 * @description: DemoServiceImpl
 * @author: wyc
 * @create: 2019-08-22 15:08
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
            return "Hello "+name;
        }

}