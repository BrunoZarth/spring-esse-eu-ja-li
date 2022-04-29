package com.cybersurferweb.springesseeujali.requests;

import lombok.Data;

@Data
public class UserPutRequestBody {
    private int id;
    private String name;
    private String email;
    private String password;
    private int score;
}
