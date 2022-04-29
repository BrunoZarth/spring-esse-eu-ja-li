package com.cybersurferweb.springesseeujali.mapper;

import com.cybersurferweb.springesseeujali.model.User;
import com.cybersurferweb.springesseeujali.requests.UserPostRequestBody;
import com.cybersurferweb.springesseeujali.requests.UserPutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class UserMapper {

    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    public abstract User toUser(UserPutRequestBody userPutRequestBody);

    public abstract User toUser(UserPostRequestBody userPostRequestBody);
}
