package com.cybersurferweb.springesseeujali.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class UserPostRequestBody {

    @NotEmpty(message = "User name cant be empty")
    @NotNull(message = "User name cant be null")
    private String name;

    @NotEmpty(message = "User email cant be empty")
    @NotNull(message = "User email cant be null")
    private String email;

    @NotEmpty(message = "User password cant be empty")
    @NotNull(message = "User password cant be null")
    private String password;

    private int score;
}
