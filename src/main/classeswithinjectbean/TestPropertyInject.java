package main.classeswithinjectbean;

import main.beanclasses.Terminator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestPropertyInject {
    @Autowired
    private Terminator terminator;

    public void sayTerminator(){
        terminator.sayMyName();
    }
}
