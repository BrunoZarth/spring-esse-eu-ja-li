package com.cybersurferweb.springesseeujali.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eita")
public class helloController {

    @GetMapping
    public String hello(){
        return "EEEITAAA";
    }
}
