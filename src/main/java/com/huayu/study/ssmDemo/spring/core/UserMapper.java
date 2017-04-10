package com.huayu.study.ssmDemo.spring.core;

import com.huayu.study.ssmDemo.spring.common.domain.po.User;
import org.springframework.stereotype.Service;

@Service
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}