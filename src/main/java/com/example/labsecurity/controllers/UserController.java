package com.example.labsecurity.controllers;

import com.example.labsecurity.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/profile")
    public String profile(User user) {
        return "User profile" + user.getUsername();
    }
}
