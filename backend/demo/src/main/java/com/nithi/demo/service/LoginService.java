package com.nithi.demo.service;

import com.nithi.demo.model.LoginRegistry;
import com.nithi.demo.repository.LoginRegistryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginRegistryRepo loginRegistryRepo;

    public List<LoginRegistry> enrolled() {
        return loginRegistryRepo.findAll();
    }

    public void enrollLoginService(String username, String password) {
        LoginRegistry loginRegistry = new LoginRegistry(username, password);
        loginRegistryRepo.save(loginRegistry);
    }
}