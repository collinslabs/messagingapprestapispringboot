package com.messagingapp.messaging_app.controller;


import com.messagingapp.messaging_app.entity.GroupEntity;
import com.messagingapp.messaging_app.service.GroupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/groups")
public class GroupController {

    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping
    public List<GroupEntity> findAllGroup(){
        return groupService.findAllGroups();
    }

    @GetMapping("/{group_id}")
    public Optional<GroupEntity> findUserById(@PathVariable("group_id")Long group_id){
        return groupService.findById(group_id);
    }

    @PostMapping
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
