package com.messagingapp.messaging_app.service;

import com.messagingapp.messaging_app.entity.GroupEntity;

import java.util.List;
import java.util.Optional;

public interface GroupService {
    List<GroupEntity> findAllGroups();
    Optional<GroupEntity> findById(Long group_id);
    GroupEntity saveGroup(GroupEntity groupEntity);
    GroupEntity updateGroup(GroupEntity groupEntity);
    void deleteGroup(Long group_id);
}
