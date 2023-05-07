package com.skywalker.user.resource;

import com.skywalker.user.models.UserCreateRequest;
import com.skywalker.user.models.UserDetailsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserResource {

    @PostMapping("/user")
    public void createUser(@RequestBody UserCreateRequest userCreateRequest){

    }

    @GetMapping("/user")
    public ResponseEntity<UserDetailsDto> getUserDetails(@RequestParam(name ="user_id")String userId){
        return null;
    }

}
