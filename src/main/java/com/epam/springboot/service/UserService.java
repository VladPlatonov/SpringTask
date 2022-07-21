package com.epam.springboot.service;

import com.epam.springboot.aop.logging.Loggable;
import com.epam.springboot.entity.User;
import com.epam.springboot.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;

@Service
public class UserService {

    private UserRepo userRepo;
    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    @Loggable(showArgs = true, showResult = true, unit = ChronoUnit.MILLIS)
    public User userSave(User user){
        return userRepo.save(user);
    }
    //@Loggable(showArgs = true, showResult = true, unit = ChronoUnit.MILLIS)
    public User findUserByUsername(String username){
        return userRepo.findUserByUsername(username);
    }
    @Loggable(showArgs = true, showResult = true, unit = ChronoUnit.MILLIS)
    public User findUserById(Long id){
        return userRepo.findById(id).get();
    }
}
