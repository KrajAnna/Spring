package pl.coderslab.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import pl.coderslab.CustomerLogger;

import java.time.LocalDateTime;

@Component
public class SimpleCustomerLogger implements CustomerLogger {
    @Override
    public void log() {
        System.out.println(LocalDateTime.now() + " :customer operation");
    }

    @Override
    public void log(String operation, boolean success) {
        System.out.println(LocalDateTime.now() + ": customer operation: " + operation + " status: " + success);

    }
}
