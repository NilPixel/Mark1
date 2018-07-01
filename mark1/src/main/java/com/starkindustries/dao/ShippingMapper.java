package com.starkindustries.dao;

import com.starkindustries.pojo.Shipping;

public interface ShippingMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(Shipping record);

    int insertSelective(Shipping record);

    Shipping selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(Shipping record);

    int updateByPrimaryKey(Shipping record);
}