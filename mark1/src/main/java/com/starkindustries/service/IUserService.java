package com.starkindustries.service;

import com.starkindustries.common.ServerResponse;
import com.starkindustries.pojo.User;

public interface IUserService {
    ServerResponse<User> login(String userName, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str, String type);

    ServerResponse<String> selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username, String question, String answer);
}
