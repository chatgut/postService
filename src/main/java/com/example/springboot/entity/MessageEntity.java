package com.example.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class MessageEntity {
    @Id
    private String id;
    private String senderName;
    private String receiverName;
    private String message;


}
