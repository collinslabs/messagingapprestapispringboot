package com.messagingapp.messagingapp.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="messages")
public class MessageEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Integer messageId;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private UserEntity sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private UserEntity receiver;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private GroupEntity groupEntity;

    @Column(nullable = false)
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_modified")
    private Date date_modified;

    @PrePersist
    protected void onCreate() {
        this.date_modified = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.date_modified = new Date();
    }


    public MessageEntity() {
    }

    public MessageEntity(Integer messageId, UserEntity sender, UserEntity receiver, GroupEntity groupEntity, String content, Date date_modified) {
        this.messageId = messageId;
        this.sender = sender;
        this.receiver = receiver;
        this.groupEntity = groupEntity;
        this.content = content;
        this.date_modified = date_modified;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public UserEntity getSender() {
        return sender;
    }

    public void setSender(UserEntity sender) {
        this.sender = sender;
    }

    public UserEntity getReceiver() {
        return receiver;
    }

    public void setReceiver(UserEntity receiver) {
        this.receiver = receiver;
    }

    public GroupEntity getGroupEntity() {
        return groupEntity;
    }

    public void setGroupEntity(GroupEntity groupEntity) {
        this.groupEntity = groupEntity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(Date date_modified) {
        this.date_modified = date_modified;
    }
}
