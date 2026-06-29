package com.nithi.demo.controller;

import com.nithi.demo.model.Contact;
import com.nithi.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping("/send")
    public String sendMessage(@RequestBody Contact contact){

        service.saveMessage(contact);

        return "Message Sent Successfully";
    }

    @GetMapping("/all")
    public List<Contact> getMessages(){

        return service.getAllMessages();
    }
}