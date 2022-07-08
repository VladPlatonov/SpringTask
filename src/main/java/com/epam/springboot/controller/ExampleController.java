package com.epam.springboot.controller;


import com.epam.springboot.service.SingletonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class ExampleController {

    @Autowired
    private SingletonService singletonService;

    @GetMapping("/v1/example")
    public List<String> getMethod() throws InterruptedException {
        String first = singletonService.getMethod();
        Thread.sleep(1000L);
        return Arrays.asList(first, LocalDateTime.now().toString());

    }
}
