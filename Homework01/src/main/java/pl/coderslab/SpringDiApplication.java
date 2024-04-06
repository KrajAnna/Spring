package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.FileCustomerLogger;
import pl.coderslab.beans.SimpleCustomerLogger;


public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SimpleCustomerLogger simpleCustomerLogger = context.getBean(SimpleCustomerLogger.class);
        simpleCustomerLogger.log();

        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
        Customer customer = new Customer(1, "Anna", "K");
        customerRepository.add(customer);
        customerRepository.add(customer);
        System.out.println(customerRepository.downloadList());
        customerRepository.remove(customer);
        customerRepository.remove(customer);

        FileCustomerLogger fileCustomerLogger = context.getBean(FileCustomerLogger.class);
        fileCustomerLogger.log();

        context.close();
    }
}
