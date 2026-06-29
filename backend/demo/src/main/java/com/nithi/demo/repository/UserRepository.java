package com.nithi.demo.repository;
import com.nithi.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Integer> {
        User findByEmail(String email);
    }
