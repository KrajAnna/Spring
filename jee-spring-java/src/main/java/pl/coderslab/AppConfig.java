package pl.coderslab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import pl.coderslab.beans.HelloWorld;

@ComponentScan
@Configuration
public class AppConfig {

    @Primary
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }


}
