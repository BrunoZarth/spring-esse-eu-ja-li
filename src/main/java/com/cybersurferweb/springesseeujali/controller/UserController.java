package com.cybersurferweb.springesseeujali.controller;

import com.cybersurferweb.springesseeujali.Service.UserService;
import com.cybersurferweb.springesseeujali.model.User;
import com.cybersurferweb.springesseeujali.repository.UserRepository;
import com.cybersurferweb.springesseeujali.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
@Log4j2
public class UserController {

    DateUtil dateUtil;
    private final UserService userService;

    @GetMapping("/users")
    private ResponseEntity<List<User>> listaUsuarios(){
        log.info(dateUtil.formatLocalDateToDatabaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(userService.findAll());
    }

}
