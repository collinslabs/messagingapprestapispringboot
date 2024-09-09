package com.messagingapp.messagingapp.service;

import com.messagingapp.messagingapp.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserEntity>findAllUsers();
    Optional<UserEntity> findById(Integer userId);
    UserEntity saveUser(UserEntity userEntity);
    UserEntity updateUser(UserEntity userEntity);
    void deleteUser(Integer userId);

    Optional<UserEntity> findByEmail(String email);
}
