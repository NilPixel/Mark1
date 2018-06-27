package com.starkindustries.dao;

import com.starkindustries.pojo.Product;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);
}