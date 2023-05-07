package com.skywalker.user.service;

import com.skywalker.user.models.UserCreateRequest;
import com.skywalker.user.models.UserDetailsDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {


    @Override
    public void create(UserCreateRequest userCreateRequest) {

    }

    @Override
    public UserDetailsDto get(String userId) {
        return null;
    }

    @Override
    public List<UserDetailsDto> getAll() {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
