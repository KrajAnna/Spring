package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SimpleCustomerLogger simpleCustomerLogger = context.getBean(SimpleCustomerLogger.class);
        simpleCustomerLogger.log();


        context.close();
    }
}
