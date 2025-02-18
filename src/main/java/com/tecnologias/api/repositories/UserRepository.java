package com.tecnologias.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tecnologias.api.models.User;

public interface UserRepository extends JpaRepository<User,UUID> {

    
}

