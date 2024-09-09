package com.messagingapp.messagingapp.repository;

import com.messagingapp.messagingapp.entity.GroupUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupUserRepository extends JpaRepository<GroupUserEntity, Long> {

}
