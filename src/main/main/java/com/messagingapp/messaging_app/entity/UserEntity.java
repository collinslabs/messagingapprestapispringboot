package com.messagingapp.messaging_app.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "full_name")
    private String full_name;

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

    public UserEntity(Long userId, String full_name, String email, String password, Date date_modified) {
        this.userId = userId;
        this.full_name = full_name;
        this.email = email;
        this.password = password;
        this.date_modified = date_modified;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
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
