package com.starkindustries.dao;

import com.starkindustries.pojo.PayInfo;

public interface PayInfoMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(PayInfo record);

    int insertSelective(PayInfo record);

    PayInfo selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(PayInfo record);

    int updateByPrimaryKey(PayInfo record);
}