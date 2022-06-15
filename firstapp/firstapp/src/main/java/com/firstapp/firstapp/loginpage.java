package com.firstapp.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginpage {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome bingo";
    }
}
