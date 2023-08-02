package com.example.springboot.controller;

import com.example.springboot.entity.MessageEntity;
import com.example.springboot.service.ChatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final ChatService chatService;

    public MessageController(ChatService messageService) {
        this.chatService = messageService;
    }

    @PostMapping()
    public ResponseEntity<MessageEntity> sendMessage(@RequestBody MessageEntity message) {
        MessageEntity sentMessage = chatService.sendMessage(message);
        return ResponseEntity.ok(sentMessage);
    }
    @GetMapping()
    public ResponseEntity<List<MessageEntity>> getChatRoomMessages() {
        List<MessageEntity> chatRoomMessages = chatService.getAllMessages();
        return ResponseEntity.ok(chatRoomMessages);
    }
}

