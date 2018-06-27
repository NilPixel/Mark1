package com.starkindustries.dao;

import com.starkindustries.pojo.Order;

public interface OrderMapper {
    int insert(Order record);

    int insertSelective(Order record);
}