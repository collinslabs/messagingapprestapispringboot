package com.messagingapp.messagingapp.repository;

import com.messagingapp.messagingapp.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageEntity, Integer> {
}
