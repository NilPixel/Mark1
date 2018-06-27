package com.starkindustries.dao;

import com.starkindustries.pojo.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}