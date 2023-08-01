package com.example.springboot.repository;

import com.example.springboot.entity.MessageEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface MessageRepository extends ListCrudRepository<MessageEntity,Long> {

    List<MessageEntity> findByMessage(String name);
}
