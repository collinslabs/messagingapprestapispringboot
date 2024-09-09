package com.messagingapp.messaging_app.service;

import com.messagingapp.messaging_app.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserEntity>findAllUsers();
    Optional<UserEntity> findById(Long user_id);
    UserEntity saveUser(UserEntity userEntity);
    UserEntity updateUser(UserEntity userEntity);
    void deleteUser(Long user_id);
}
