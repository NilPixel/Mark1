package com.starkindustries.dao;

import com.starkindustries.pojo.Category;

public interface CategoryMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}