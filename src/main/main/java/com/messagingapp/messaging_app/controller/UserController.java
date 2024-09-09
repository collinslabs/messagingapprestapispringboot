package com.messagingapp.messaging_app.controller;

import com.messagingapp.messaging_app.entity.UserEntity;
import com.messagingapp.messaging_app.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserEntity>findAllUser(){
        return userService.findAllUsers();
    }

    @GetMapping("/{user_id}")
    public Optional<UserEntity> findUserById(@PathVariable("user_id")Long user_id){
        return userService.findById(user_id);
    }

    @PostMapping
    public UserEntity saveUser(@RequestBody UserEntity userEntity){
        return  userService.saveUser(userEntity);
    }

    @PutMapping
    public UserEntity updateUser(@RequestBody UserEntity userEntity){
        return  userService.updateUser(userEntity);
    }

    @DeleteMapping
    public void deleteUser(@PathVariable("user_id")Long user_id){
        userService.deleteUser(user_id);
    }
}
