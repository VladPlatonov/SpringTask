package com.epam.springboot.testcircular;

import com.epam.springboot.circularresolve.A;
import com.epam.springboot.circularresolve.B;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestResolveConfig.class })
public class CircularResolveTest {

    @Autowired
    ApplicationContext context;

    @Bean
    public A a() {
        return new A();
    }

    @Bean
    public B b() {
        return new B();
    }

    @Test
    public void givenCircularDependency_whenSetterInjection_thenItWorks() {
        A a = context.getBean(A.class);

        Assert.assertEquals("Resolve!", a.getB().getMessage());
    }
}
