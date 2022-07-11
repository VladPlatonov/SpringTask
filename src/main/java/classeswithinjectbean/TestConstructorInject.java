package classeswithinjectbean;

import beanclasses.Terminator;
import beanclasses.Terminator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestConstructorInject {
    private Terminator terminator;

    @Autowired
    public TestConstructorInject(Terminator terminator) {
        this.terminator = terminator;
    }

    public Terminator getTerminator() {
        return terminator;
    }
}
