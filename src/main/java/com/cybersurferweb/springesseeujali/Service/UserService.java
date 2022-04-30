package com.cybersurferweb.springesseeujali.Service;

import com.cybersurferweb.springesseeujali.exception.BadRequestException;
import com.cybersurferweb.springesseeujali.model.User;
import com.cybersurferweb.springesseeujali.repository.UserRepository;
import com.cybersurferweb.springesseeujali.requests.UserPostRequestBody;
import com.cybersurferweb.springesseeujali.requests.UserPutRequestBody;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findByIdOrThrowBadRequestException(int id){
        return userRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("User id not found!"));
    }

    public List<User> findByName(String name){
        return userRepository.findByName(name);
    }

    public User saveUser(UserPostRequestBody userPostRequestBody){

        User user = User.builder()
                .email(userPostRequestBody.getEmail())
                .name(userPostRequestBody.getName())
                .password(userPostRequestBody.getPassword())
                .score(userPostRequestBody.getScore())
                .build();

        userRepository.save(user);
        this.findByIdOrThrowBadRequestException(user.id);
        return user;
    }

    public void deleteUserById(int id){
        this.findByIdOrThrowBadRequestException(id);
        userRepository.deleteById(id);
    }

    public User replaceUser(UserPutRequestBody userPutRequestBody) {
        User savedUser = this.findByIdOrThrowBadRequestException(userPutRequestBody.getId());
        User user = User.builder()
                .id(userPutRequestBody.getId())
                .email(userPutRequestBody.getEmail())
                .name(userPutRequestBody.getName())
                .password(userPutRequestBody.getPassword())
                .score(userPutRequestBody.getScore())
                .build();

        userRepository.save(user);
        return user;
    }

}
