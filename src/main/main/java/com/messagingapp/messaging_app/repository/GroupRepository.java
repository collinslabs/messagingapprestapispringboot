package com.messagingapp.messaging_app.repository;

import com.messagingapp.messaging_app.entity.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository <GroupEntity, Long> {
}
