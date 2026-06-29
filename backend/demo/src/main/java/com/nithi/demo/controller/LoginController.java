package com.nithi.demo.controller;

import com.nithi.demo.model.LoginRegistry;
import com.nithi.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/Login")
    public List<LoginRegistry> enrolled() {
        return loginService.enrolled();
    }

    @PostMapping("/Login/register")
    public String enrollLogin(
            @RequestParam String username,
            @RequestParam String password) {

        loginService.enrollLoginService(username, password);
        return "Congratulations! " + username + " Enrolled successfully";
    }
}