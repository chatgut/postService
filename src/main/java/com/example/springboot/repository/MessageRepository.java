package com.example.springboot.repository;

import com.example.springboot.entity.MessageEntity;
import org.springframework.data.repository.ListCrudRepository;


public interface MessageRepository extends ListCrudRepository<MessageEntity, String> {

}
