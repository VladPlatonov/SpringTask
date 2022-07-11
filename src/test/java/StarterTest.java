import beanclasses.Terminator;
import classeswithinjectbean.TestConstructorInject;
import classeswithinjectbean.TestPropertyInject;
import classeswithinjectbean.TestSetterInject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcontext.JavaConfig;

import static org.junit.Assert.*;




public class StarterTest {

    ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    ApplicationContext xml = new ClassPathXmlApplicationContext("context.xml");

    @Test
    public void getBeanAnnotationConfig_andCheckMessageTest(){
        String expected = "My nameeeeeee is T800";
        assertEquals(expected,context.getBean(TestConstructorInject.class).getTerminator().sayMyName());
        assertEquals(expected,context.getBean(TestPropertyInject.class).getTerminator().sayMyName());
        assertEquals(expected,context.getBean(TestSetterInject.class).getTerminator().sayMyName());
    }
    @Test
    public void getBeanXmlConfig_andCheckMessageTest(){
        String expected = "My nameeeeeee is T1000";
        assertEquals(expected,xml.getBean(Terminator.class).sayMyName());
    }
}