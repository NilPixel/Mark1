package com.starkindustries.dao;

import com.starkindustries.pojo.Shipping;

public interface ShippingMapper {
    int insert(Shipping record);

    int insertSelective(Shipping record);
}