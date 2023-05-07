package com.skywalker.user.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class AddressForm {

    @JsonProperty("address_id")
    private Integer addressId;

    @NotBlank
    @JsonProperty("addr_line_1")
    private String addressLine1;

    @JsonProperty("addr_line_2")
    private String addressLine2;

    @JsonProperty("landmark")
    private String landmark;

    @NotBlank
    @JsonProperty("district")
    private String district;

    @NotBlank
    @JsonProperty("state")
    private String state;

    @NotBlank
    @JsonProperty("pincode")
    private String pincode;

    @NotBlank
    @JsonProperty("country")
    private String country;
}
