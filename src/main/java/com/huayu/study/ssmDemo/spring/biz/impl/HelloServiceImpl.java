package com.huayu.study.ssmDemo.spring.biz.impl;

import com.huayu.study.ssmDemo.spring.biz.IHelloService;
import org.springframework.stereotype.Service;

/**
 * Created by zhaohuayu on 17/3/10.
 */
@Service
public class HelloServiceImpl implements IHelloService{

    public HelloServiceImpl() {
        System.out.println("init HelloServiceImpl");
    }

    public String sayHello() {
        return "hello world!Service" ;
    }
}
