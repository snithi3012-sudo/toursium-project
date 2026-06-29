package com.nithi.demo.service;

import com.nithi.demo.model.Contact;
import com.nithi.demo.repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepo repo;

    public void saveMessage(Contact contact){
        repo.save(contact);
    }

    public List<Contact> getAllMessages(){
        return repo.findAll();
    }
}