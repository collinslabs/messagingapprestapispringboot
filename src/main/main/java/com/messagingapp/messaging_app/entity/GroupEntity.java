package com.messagingapp.messaging_app.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="groups")
public class GroupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long groupId;

    @Column(name = "group_name")
    private String group_name;

    @Column(name="description")
    private String description;

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

    public GroupEntity() {
    }

    public GroupEntity(Long groupId, String group_name, String description, Date date_modified) {
        this.groupId = groupId;
        this.group_name = group_name;
        this.description = description;
        this.date_modified = date_modified;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(Date date_modified) {
        this.date_modified = date_modified;
    }
}
