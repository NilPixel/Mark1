package com.starkindustries.dao;

import com.starkindustries.pojo.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}