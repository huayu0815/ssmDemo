package com.huayu.study.ssmDemo.spring.biz.impl;

import com.huayu.study.ssmDemo.spring.biz.IUserService;
import com.huayu.study.ssmDemo.spring.common.domain.po.User;
import com.huayu.study.ssmDemo.spring.core.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaohuayu on 17/3/13.
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    UserMapper userMapper;

    public User getUser(int uid) {
        return userMapper.selectByPrimaryKey(uid) ;
    }

    public int addUser(User user) {
        return userMapper.insert(user) ;
    }

    public void updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user) ;
    }
}
