package com.messagingapp.messagingapp.service;

import com.messagingapp.messagingapp.entity.GroupUserEntity;
import com.messagingapp.messagingapp.entity.MessageEntity;

import java.util.List;
import java.util.Optional;

public interface MessageService {
    List<MessageEntity> findAllMessages();
    Optional<MessageEntity> findById(Integer messageId);
    MessageEntity saveMessage(MessageEntity messageEntity);
    MessageEntity updateMessage(MessageEntity messageEntity);
    void deleteMessage(Integer messageId);

    MessageEntity sendMessage(MessageEntity messageEntity);

    List<MessageEntity> findMessagesByUserId(String userId);

    List<MessageEntity> findMessagesBetweenUsers(String user1Id, String user2Id);

}
