package com.skywalker.user.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.skywalker.user.entity.UserEntity;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCreateRequest {

    @NotBlank
    @JsonProperty("user_name")
    private String username;

    @NotBlank
    @JsonProperty("password")
    private String password;

    @NotBlank
    @JsonProperty("phone_number")
    private String phoneNumber;

    @NotBlank
    @JsonProperty("email")
    private String email;

    @NotBlank
    @JsonProperty("dob")
    private String dob;

    @JsonProperty("address_list")
    private AddressForm addressForm;

    // migrate to utils function
//    private UserEntity to(){
//
//
//
//        return UserEntity.builder()
//                .username()
//                .userIdentifiers()
//                .phoneNumber()
//                .email()
//                .dob()
//                .address()
//    }

}
