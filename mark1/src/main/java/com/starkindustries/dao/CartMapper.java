package com.starkindustries.dao;

import com.starkindustries.pojo.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}