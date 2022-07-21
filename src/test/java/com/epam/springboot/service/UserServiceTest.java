package com.epam.springboot.service;

import com.epam.springboot.entity.User;
import com.epam.springboot.repository.UserRepo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { ServiceTestConfig.class })
@SpringBootTest
class UserServiceTest {

    @MockBean
    UserRepo userRepo;
    @Autowired
    UserService userService;


    @Test
    void userSave() {
        User user = User.builder().userId(2L).username("David").build();
        userService.userSave(user);
        verify(userRepo).save(user);
    }

    @Test
    void findUserByUsername() {
        when(userRepo.findUserByUsername("Vlad"))
                .thenReturn(User.builder().userId(1L).username("Vlad").build());
        assertEquals("Vlad", userService.findUserByUsername("Vlad").getUsername());
    }
}