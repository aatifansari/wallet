package com.skywalker.user.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.skywalker.user.enums.UserIdentifiers;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDetailsDto {

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("user_name")
    private String username;

    @JsonProperty("user_identifiers")
    private UserIdentifiers userIdentifiers;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("email")
    private String email;

    @JsonProperty("age")
    private String age;

    @JsonProperty("addresses_list")
    private List<AddressForm> addressFormList;

}
