package com.huayu.study.ssmDemo.spring.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhaohuayu on 17/3/10.
 */
@Controller
public class HelloController {
    public HelloController() {
        System.out.println("init helloController!");
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String test() {
        return "hello world!";
    }

    @RequestMapping("/index")
    public String index() {
        System.out.println("index");
        return "index";
    }

}
