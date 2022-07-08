package com.epam.springboot.service;

import com.epam.springboot.entity.User;
import com.epam.springboot.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    UserRepo userRepo;
    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void userSave(User user){
        userRepo.save(user);
    }
    public User findUserByUsername(String username){
        return userRepo.findUserByUsername(username);
    }
}
