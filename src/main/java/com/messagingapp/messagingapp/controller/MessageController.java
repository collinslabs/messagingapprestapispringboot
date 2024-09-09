package com.messagingapp.messagingapp.controller;

import com.messagingapp.messagingapp.entity.MessageEntity;
import com.messagingapp.messagingapp.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/messages")
public class MessageController {

    private final MessageService messageService;
    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public MessageController(MessageService messageService, SimpMessagingTemplate messagingTemplate) {
        this.messageService = messageService;
        this.messagingTemplate = messagingTemplate;
    }

    @GetMapping
    public List<MessageEntity> findAllMessage() {
        return messageService.findAllMessages();
    }

    @GetMapping("/user/{user1}/{user2}")
    public List<MessageEntity> findMessagesByUserId(@PathVariable("user1") String user1Id, @PathVariable("user2") String user2Id) {
        return messageService.findMessagesBetweenUsers(user1Id, user2Id);
    }

    @GetMapping("/user/{user_id}")
    public List<MessageEntity> findMessagesByUserId(@PathVariable("user_id") String userId) {
        return messageService.findMessagesByUserId(userId);
    }

    @PostMapping("/send")
    public MessageEntity saveMessage(@RequestBody MessageEntity messageEntity) {
        MessageEntity savedMessage = messageService.saveMessage(messageEntity);
        messagingTemplate.convertAndSend("/topic/messages", savedMessage);
        return savedMessage;
    }

    @PutMapping
    public MessageEntity updateMessage(@RequestBody MessageEntity messageEntity) {
        return messageService.updateMessage(messageEntity);
    }

    @DeleteMapping("/{message_id}")
    public void deleteMessage(@PathVariable("message_id") Integer messageId) {
        messageService.deleteMessage(messageId);
    }
}
