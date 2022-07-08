package com.epam.springboot.entity;


import lombok.*;
import lombok.experimental.Tolerate;

import javax.persistence.*;

@Entity
@Builder
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(value = AccessLevel.PROTECTED)
    private Long userId;

    private String username;


    @Tolerate
    public User() {

    }
}
