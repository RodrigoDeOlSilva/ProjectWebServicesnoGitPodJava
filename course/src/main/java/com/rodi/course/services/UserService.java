package com.rodi.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodi.course.entities.User;
import com.rodi.course.repositories.UserRepositiry;

@Service
public class UserService {
    
    @Autowired
    private UserRepositiry repositiry;

    public List<User> findAll(){
        return repositiry.findAll();
    }

    public User findById(Long id){
       Optional<User> obj = repositiry.findById(id);
       return obj.get();
    }

}
