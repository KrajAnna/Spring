package pl.coderslab.beans;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class PersonService {
    private final PersonRepository personRepository;


    //@Autowired
    public PersonService (PersonRepository personRepository){
        this.personRepository = personRepository;
    }
}
