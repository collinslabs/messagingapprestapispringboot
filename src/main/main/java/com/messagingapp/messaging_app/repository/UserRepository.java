package com.messagingapp.messaging_app.repository;

import com.messagingapp.messaging_app.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <UserEntity, Long>{

}
