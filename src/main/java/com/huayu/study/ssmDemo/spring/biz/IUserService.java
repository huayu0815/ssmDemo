package com.huayu.study.ssmDemo.spring.biz;

import com.huayu.study.ssmDemo.spring.common.domain.po.User;

/**
 * Created by zhaohuayu on 17/3/13.
 */
public interface IUserService {

    User getUser(int uid) ;

    int addUser(User user) ;

    void updateUser(User user) ;

}
