package com.epam.springboot.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.epam.springboot.service","com.epam.springboot.repository" })
public class ServiceTestConfig {
}
