package com.example.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MessageEntity {
    @Id
    private String id;

    private String fromUsername;
    private String toUsername;

    private String message;

    public MessageEntity() {

    }
    public MessageEntity(String id, String fromUsername, String toUsername, String message) {
        this.id = id;
        this.fromUsername = fromUsername;
        this.toUsername = toUsername;
        this.message = message;

    }





    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFromUsername() {
        return fromUsername;
    }

    public void setFromUsername(String fromUsername) {
        this.fromUsername = fromUsername;
    }

    public String getToUsername() {
        return toUsername;
    }

    public void setToUsername(String toUsername) {
        this.toUsername = toUsername;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
