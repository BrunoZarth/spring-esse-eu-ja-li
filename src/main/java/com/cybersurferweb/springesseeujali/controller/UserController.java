package com.cybersurferweb.springesseeujali.controller;

import com.cybersurferweb.springesseeujali.Service.UserService;
import com.cybersurferweb.springesseeujali.model.User;
import com.cybersurferweb.springesseeujali.repository.UserRepository;
import com.cybersurferweb.springesseeujali.requests.UserPostRequestBody;
import com.cybersurferweb.springesseeujali.requests.UserPutRequestBody;
import com.cybersurferweb.springesseeujali.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/user/{id}")
    private ResponseEntity<User> findById(@PathVariable int id){
        return ResponseEntity.ok(userService.findByIdOrThrowBadRequestException(id));
    }

    @PostMapping("/saveUser")
    @ResponseStatus(HttpStatus.CREATED)
    private ResponseEntity<User> saveUser(@RequestBody UserPostRequestBody userPostRequestBody){
        return new ResponseEntity<>(userService.saveUser(userPostRequestBody), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteUser/{id}")
    private ResponseEntity<Void> deleteUserById(@PathVariable int id){
        userService.deleteUserById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/replaceUser")
    private ResponseEntity<User> replaceUser(@RequestBody UserPutRequestBody userPutRequestBody){
        return new ResponseEntity<>(userService.replaceUser(userPutRequestBody), HttpStatus.CREATED);
    }
}
