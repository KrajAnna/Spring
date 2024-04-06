package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


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


        context.close();
    }
}
