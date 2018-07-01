package com.starkindustries.dao;

import com.starkindustries.pojo.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}