package com.messagingapp.messagingapp.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name="email")
    private String email;

    @Column (name="password")
    private String password;


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

    public UserEntity() {
    }

    public UserEntity(Integer userId, String fullName, String email, String password, Date date_modified) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.date_modified = date_modified;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(Date date_modified) {
        this.date_modified = date_modified;
    }
}
