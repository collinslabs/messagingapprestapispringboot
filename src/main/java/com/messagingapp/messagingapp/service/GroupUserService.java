package com.messagingapp.messagingapp.service;

import com.messagingapp.messagingapp.entity.GroupUserEntity;

import java.util.List;
import java.util.Optional;

public interface GroupUserService {
    List<GroupUserEntity> findAllGroupUsers();
    Optional<GroupUserEntity> findById(Long grouperId);
    GroupUserEntity saveGroupUser(GroupUserEntity groupUserEntity);
    GroupUserEntity updateGroupUser(GroupUserEntity groupUserEntity);
    void deleteGroupUser(Long grouperId);
}
