package com.epam.springboot.testcircular;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.epam.springboot.circulardependency" })
public class TestConfig {

}
