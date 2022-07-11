
import beanclasses.Terminator;
import classeswithinjectbean.TestConstructorInject;
import classeswithinjectbean.TestPropertyInject;
import classeswithinjectbean.TestSetterInject;
import springcontext.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        applicationContext.getBean(TestConstructorInject.class).getTerminator().sayMyName();
        applicationContext.getBean(TestPropertyInject.class).getTerminator().sayMyName();
        applicationContext.getBean(TestSetterInject.class).getTerminator().sayMyName();
        applicationContext.registerShutdownHook();
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("context.xml");
        classPathXmlApplicationContext.getBean(Terminator.class).sayMyName();
        classPathXmlApplicationContext.registerShutdownHook();

    }
}
