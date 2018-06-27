package com.starkindustries.dao;

import com.starkindustries.pojo.PayInfo;

public interface PayInfoMapper {
    int insert(PayInfo record);

    int insertSelective(PayInfo record);
}