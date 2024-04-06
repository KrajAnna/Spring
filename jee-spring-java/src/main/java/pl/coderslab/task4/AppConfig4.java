package pl.coderslab.task4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppConfig4 {
    @Bean
    @Scope("prototype")
    public ScopePrototype scopePrototype(){
        return new ScopePrototype();
    }

    @Bean
    public ScopeSingleton scopeSingleton(){
        return new ScopeSingleton();
    }
}
