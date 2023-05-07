package com.skywalker.user.service;

import com.skywalker.user.models.UserCreateRequest;
import com.skywalker.user.models.UserDetailsDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    void create(UserCreateRequest userCreateRequest);

    // implement strategy design pattern to find user by user_id, user_name, phone_number
    UserDetailsDto get(String userId);

    // called any by admin user
    List<UserDetailsDto> getAll();

}
