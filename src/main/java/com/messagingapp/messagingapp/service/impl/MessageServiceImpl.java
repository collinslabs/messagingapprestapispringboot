package com.messagingapp.messagingapp.service.impl;

import com.messagingapp.messagingapp.entity.MessageEntity;
import com.messagingapp.messagingapp.repository.MessageRepository;
import com.messagingapp.messagingapp.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<MessageEntity> findAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public Optional<MessageEntity> findById(Integer messageId) {
        return messageRepository.findById(messageId);
    }

    @Override
    public MessageEntity saveMessage(MessageEntity messageEntity) {
        return messageRepository.save(messageEntity);
    }

    @Override
    public MessageEntity updateMessage(MessageEntity messageEntity) {
        return messageRepository.save(messageEntity);
    }

    @Override
    public void deleteMessage(Integer messageId) {
        messageRepository.deleteById(messageId);
    }

    @Override
    public MessageEntity sendMessage(MessageEntity messageEntity) {
        return null;
    }

    @Override
    public List<MessageEntity> findMessagesByUserId(String userId) {
        return List.of();
    }

    @Override
    public List<MessageEntity> findMessagesBetweenUsers(String user1Id, String user2Id) {
        return List.of();
    }
}
