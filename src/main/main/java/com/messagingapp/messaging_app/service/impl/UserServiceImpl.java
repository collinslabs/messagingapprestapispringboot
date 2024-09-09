package com.messagingapp.messaging_app.service.impl;


import com.messagingapp.messaging_app.entity.UserEntity;
import com.messagingapp.messaging_app.repository.UserRepository;
import com.messagingapp.messaging_app.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> findById(Long user_id) {
        return userRepository.findById(user_id);
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity updateUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(Long user_id) {
      userRepository.deleteById(user_id);
    }
}
