package com.epam.springboot.circularresolve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    private B b;

    public B getB() {
        return b;
    }
    @Autowired
    public void setB(B b) {
        this.b = b;
    }
}
