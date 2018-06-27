package com.starkindustries.dao;

import com.starkindustries.pojo.Cart;

public interface CartMapper {
    int insert(Cart record);

    int insertSelective(Cart record);
}