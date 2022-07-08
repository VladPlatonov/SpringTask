package com.epam.springboot.circularresolve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

    private A a;

    private String message = "Resolve!";

    public A getA() {
        return a;
    }
    @Autowired
    public void setA(A a) {
        this.a = a;
    }

    public String getMessage() {
        return message;
    }
}
