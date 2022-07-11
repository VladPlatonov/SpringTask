package springcontext;


import beanclasses.Terminator;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = { "classeswithinjectbean"  })
public class JavaConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Terminator terminator(){
        return new Terminator("T800");
    }

}