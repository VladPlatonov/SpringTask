package main.springcontext;


import main.beanclasses.Terminator;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("main")
@PropertySource("classpath:main/resource/context.properties")
public class JavaConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Terminator terminator(){
        return new Terminator("T800");
    }

}