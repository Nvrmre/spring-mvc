package com.spring.mvc.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.Repository.UserRepo;
import com.spring.mvc.models.User;

@Service
public class UserService {
    
    private UserRepo userRepo;

    @Autowired
    public List <User> getAllUsers(){
        return userRepo.findAll();
    }

    // public Optional<User> getUserById(){
    //     return userRepo.findById(Id);
    // }

}
