package main;

import main.beanclasses.Terminator;
import main.classeswithinjectbean.TestConstructorInject;
import main.classeswithinjectbean.TestPropertyInject;
import main.classeswithinjectbean.TestSetterInject;
import main.springcontext.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        applicationContext.getBean(TestConstructorInject.class).getTerminator().sayMyName();
        applicationContext.getBean(TestPropertyInject.class).sayTerminator();
        applicationContext.getBean(TestSetterInject.class).getTerminator().sayMyName();
        applicationContext.registerShutdownHook();
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("main/resource/context.xml");
        classPathXmlApplicationContext.getBean(Terminator.class);
        classPathXmlApplicationContext.registerShutdownHook();

    }
}
