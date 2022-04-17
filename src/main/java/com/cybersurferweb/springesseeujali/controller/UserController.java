package com.cybersurferweb.springesseeujali.controller;

import com.cybersurferweb.springesseeujali.model.User;
import com.cybersurferweb.springesseeujali.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/users")
    private List<User> listaUsuarios(){
        return userRepository.findAll();
    }

}
