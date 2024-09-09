package com.messagingapp.messagingapp.controller;

import com.messagingapp.messagingapp.entity.MessageEntity;
import com.messagingapp.messagingapp.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketMessageController {

    private final MessageService messageService;

    @Autowired
    public WebSocketMessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public MessageEntity sendMessage(MessageEntity messageEntity) {
        return messageService.sendMessage(messageEntity);
    }
}
