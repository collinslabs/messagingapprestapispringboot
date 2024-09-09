package com.messagingapp.messagingapp.repository;

import com.messagingapp.messagingapp.entity.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface GroupRepository extends JpaRepository<GroupEntity, Long> {

}
