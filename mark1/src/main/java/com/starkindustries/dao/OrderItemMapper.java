package com.starkindustries.dao;

import com.starkindustries.pojo.OrderItem;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}