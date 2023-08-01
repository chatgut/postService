package com.example.springboot.controller;

import com.example.springboot.entity.MessageEntity;
import com.example.springboot.repository.MessageRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessageRepository repo;

    public MessageController(MessageRepository messageRepository){
        repo = messageRepository;
    }
    @PostMapping("/message")
    public MessageEntity addMessage(@RequestBody MessageEntity message) {
        repo.save(message);
        return repo.save(message);
    }


    @GetMapping("/message")
    List<MessageEntity> getMessages() {
        return repo.findAll();
    }




}
