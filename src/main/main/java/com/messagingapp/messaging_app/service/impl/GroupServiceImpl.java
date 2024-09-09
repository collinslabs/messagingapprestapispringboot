package com.messagingapp.messaging_app.service.impl;

import com.messagingapp.messaging_app.entity.GroupEntity;
import com.messagingapp.messaging_app.repository.GroupRepository;
import com.messagingapp.messaging_app.service.GroupService;

import java.util.List;
import java.util.Optional;

public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public List<GroupEntity> findAllGroups() {
        return groupRepository.findAll();
    }

    @Override
    public Optional<GroupEntity> findById(Long group_id) {
        return groupRepository.findById(group_id);
    }

    @Override
    public GroupEntity saveGroup(GroupEntity groupEntity) {
        return groupRepository.save(groupEntity);
    }

    @Override
    public GroupEntity updateGroup(GroupEntity groupEntity) {
        return groupRepository.save(groupEntity);
    }

    @Override
    public void deleteGroup(Long group_id) {
     groupRepository.deleteById(group_id);
    }
}
