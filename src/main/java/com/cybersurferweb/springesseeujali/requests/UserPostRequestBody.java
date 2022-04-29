package com.cybersurferweb.springesseeujali.requests;

import lombok.Data;

import javax.persistence.Column;

@Data
public class UserPostRequestBody {
    private String name;
    private String email;
    private String password;
    private int score;
}
