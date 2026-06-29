package com.nithi.demo.service;
import com.nithi.demo.model.User;
import com.nithi.demo.repository.UserRepository;
import com.nithi.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {
    @Autowired
    private UserRepository repository;

    public String save(User user) {

        if (repository.findByEmail(user.getEmail()) != null) {
            return "Email already exists";
        }

        repository.save(user);

        return "Registration Successful";
    }
}
