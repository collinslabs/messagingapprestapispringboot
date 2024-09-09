package com.messagingapp.messagingapp.service.impl;

import com.messagingapp.messagingapp.entity.GroupUserEntity;
import com.messagingapp.messagingapp.repository.GroupUserRepository;
import com.messagingapp.messagingapp.service.GroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupUserServiceImpl implements GroupUserService {

    @Autowired
    private final GroupUserRepository groupUserRepository;

    public GroupUserServiceImpl(GroupUserRepository groupUserRepository) {
        this.groupUserRepository = groupUserRepository;
    }

    @Override
    public List<GroupUserEntity> findAllGroupUsers() {
        return groupUserRepository.findAll();
    }

    @Override
    public Optional<GroupUserEntity> findById(Long grouperId) {
        return groupUserRepository.findById(grouperId);
    }

    @Override
    public GroupUserEntity saveGroupUser(GroupUserEntity groupUserEntity) {
        return groupUserRepository.save(groupUserEntity);
    }

    @Override
    public GroupUserEntity updateGroupUser(GroupUserEntity groupUserEntity) {
        return groupUserRepository.save(groupUserEntity);
    }

    @Override
    public void deleteGroupUser(Long grouperId) {
        groupUserRepository.deleteById(grouperId);
    }
}
