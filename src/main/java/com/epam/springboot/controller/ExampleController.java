package com.epam.springboot.controller;


import com.epam.springboot.entity.User;
import com.epam.springboot.service.SingletonService;
import com.epam.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class ExampleController {

    private SingletonService singletonService;
    private UserService userService;
    @Autowired
    public ExampleController(SingletonService singletonService, UserService userService) {
        this.singletonService = singletonService;
        this.userService = userService;
    }

    @GetMapping("/v1/example")
    public List<String> getMethod() throws InterruptedException {
        String first = singletonService.getMethod();
        Thread.sleep(1000L);
        return Arrays.asList(first, LocalDateTime.now().toString());

    }
    @GetMapping("/v2/user")
    public String createUser()  {
        User user = User.builder().username("Vlad").build();
        userService.userSave(user);
        return userService.findUserById(2L).toString();

    }
}
