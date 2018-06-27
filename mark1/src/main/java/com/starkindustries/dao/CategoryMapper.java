package com.starkindustries.dao;

import com.starkindustries.pojo.Category;

public interface CategoryMapper {
    int insert(Category record);

    int insertSelective(Category record);
}