package com.rodi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodi.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
    
}
