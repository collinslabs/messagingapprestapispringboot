package com.messagingapp.messagingapp.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="group_users")
public class GroupUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="grouper_id")
    private Long grouperId;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private GroupEntity groupEntity;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;


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


    public GroupUserEntity() {
    }

    public GroupUserEntity(Long grouperId, GroupEntity groupEntity, UserEntity userEntity, Date date_modified) {
        this.grouperId = grouperId;
        this.groupEntity = groupEntity;
        this.userEntity = userEntity;
        this.date_modified = date_modified;
    }

    public Long getGrouperId() {
        return grouperId;
    }

    public void setGrouperId(Long grouperId) {
        this.grouperId = grouperId;
    }

    public GroupEntity getGroupEntity() {
        return groupEntity;
    }

    public void setGroupEntity(GroupEntity groupEntity) {
        this.groupEntity = groupEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public Date getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(Date date_modified) {
        this.date_modified = date_modified;
    }
}
