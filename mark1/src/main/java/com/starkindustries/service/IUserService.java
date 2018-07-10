package com.starkindustries.service;

import com.starkindustries.common.ServerResponse;
import com.starkindustries.pojo.User;

public interface IUserService {
    ServerResponse<User> login(String userName, String password);
}
