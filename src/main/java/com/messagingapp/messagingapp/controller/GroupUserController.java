package com.messagingapp.messagingapp.controller;


import com.messagingapp.messagingapp.entity.GroupUserEntity;
import com.messagingapp.messagingapp.service.GroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/groupers")
public class GroupUserController {

    @Autowired
    private final GroupUserService groupUserService;

    public GroupUserController(GroupUserService groupUserService) {
        this.groupUserService = groupUserService;
    }

    @GetMapping
    public List<GroupUserEntity>findAllGroupUser(){
        return groupUserService.findAllGroupUsers();
    }

    @GetMapping("/{grouper_id}")
    public Optional<GroupUserEntity> findGroupUserById(@PathVariable("grouper_id")Long grouper_id){
        return groupUserService.findById(grouper_id);
    }

    @PostMapping
    public GroupUserEntity saveGroupUser(@RequestBody GroupUserEntity groupUserEntity){
        return  groupUserService.saveGroupUser(groupUserEntity);
    }

    @PutMapping
    public GroupUserEntity updateGroupUser(@RequestBody GroupUserEntity groupUserEntity){
        return  groupUserService.updateGroupUser(groupUserEntity);
    }

    @DeleteMapping
    public void deleteGroupUser(@PathVariable("grouper_id")Long grouper_id){
        groupUserService.deleteGroupUser(grouper_id);
    }
}
