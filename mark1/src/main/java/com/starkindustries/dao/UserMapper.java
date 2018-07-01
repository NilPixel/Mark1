package com.starkindustries.dao;

import com.starkindustries.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}