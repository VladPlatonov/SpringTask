package classeswithinjectbean;

import beanclasses.Terminator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestSetterInject {
    private Terminator terminator;


    public Terminator getTerminator() {
        return terminator;
    }

    @Autowired
    public void setTerminator(Terminator terminator) {
        this.terminator = terminator;
    }
}
