package com.messagingapp.messagingapp.controller;

import com.messagingapp.messagingapp.entity.GroupEntity;
import com.messagingapp.messagingapp.entity.UserEntity;
import com.messagingapp.messagingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.messagingapp.messagingapp.service.GroupService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/groups")
public class GroupController {

    @Autowired
    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping
    public List<GroupEntity>findAllGroup(){
        return groupService.findAllGroups();
    }

    @GetMapping("/{group_id}")
    public Optional<GroupEntity> findGroupById(@PathVariable("group_id")Long group_id){
        return groupService.findById(group_id);
    }

    @PostMapping("/create")
    public GroupEntity saveGroup(@RequestBody GroupEntity groupEntity){
        return  groupService.saveGroup(groupEntity);
    }

    @PutMapping
    public GroupEntity updateGroup(@RequestBody GroupEntity groupEntity){
        return  groupService.updateGroup(groupEntity);
    }

    @DeleteMapping
    public void deleteGroup(@PathVariable("group_id")Long group_id){
        groupService.deleteGroup(group_id);
    }
}
