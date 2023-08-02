package com.example.springboot.service;

import com.example.springboot.entity.MessageEntity;
import com.example.springboot.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChatService {

    private final MessageRepository messageRepository;

    public ChatService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public MessageEntity sendMessage(MessageEntity message) {
        return messageRepository.save(message);
    }

    public List<MessageEntity> getAllMessages() {
        return messageRepository.findAll();
    }
}
