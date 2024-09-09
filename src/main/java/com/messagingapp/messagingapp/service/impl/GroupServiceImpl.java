package com.messagingapp.messagingapp.service.impl;


import com.messagingapp.messagingapp.entity.GroupEntity;
import com.messagingapp.messagingapp.entity.UserEntity;
import com.messagingapp.messagingapp.repository.GroupRepository;
import com.messagingapp.messagingapp.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
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
