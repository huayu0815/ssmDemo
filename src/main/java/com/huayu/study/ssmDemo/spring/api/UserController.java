package com.huayu.study.ssmDemo.spring.api;

import com.alibaba.fastjson.JSON;
import com.huayu.study.ssmDemo.spring.biz.IUserService;
import com.huayu.study.ssmDemo.spring.common.domain.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhaohuayu on 17/3/13.
 */

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String get(@PathVariable("id") String id,
                      HttpServletRequest request) {
        User user = null;
        try{
            int uid = Integer.parseInt(id);
            user =  userService.getUser(uid) ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.toJSONString(user) ;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestParam(required = false, value = "name") String name,
                      @RequestParam(required = false, value = "age") String age,
                      HttpServletRequest request) {
        int id = 0;
        try{
            User user = new User();
            user.setName(name);
            user.setAge(Integer.parseInt(age));
            id =  userService.addUser(user) ;
        } catch (Exception e) {
            e.printStackTrace();
            id = -1;
        }
        return id + "" ;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String post(@PathVariable("id") String id,
                      @RequestParam(required = false, value = "name") String name,
                      @RequestParam(required = false, value = "age") String age,
                      @RequestParam(required = false, value = "_method") String method,
                      HttpServletRequest request) {
        if("put".equals(method)) {
            User user = new User();
            user.setId(Integer.parseInt(id));
            user.setName(name);
            user.setAge(Integer.parseInt(age));
            userService.updateUser(user);
            return "success!" ;
        } else {
            return "error!";
        }
    }
}
