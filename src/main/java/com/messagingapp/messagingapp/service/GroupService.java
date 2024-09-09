package com.messagingapp.messagingapp.service;

import com.messagingapp.messagingapp.entity.GroupEntity;
import com.messagingapp.messagingapp.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface GroupService {
    List<GroupEntity> findAllGroups();
    Optional<GroupEntity> findById(Long groupId);
    GroupEntity saveGroup(GroupEntity groupEntity);
    GroupEntity updateGroup(GroupEntity groupEntity);
    void deleteGroup(Long groupId);

}
