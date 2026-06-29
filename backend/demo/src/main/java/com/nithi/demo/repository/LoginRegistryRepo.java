package com.nithi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nithi.demo.model.LoginRegistry;

public interface LoginRegistryRepo extends JpaRepository<LoginRegistry, Integer> {

}