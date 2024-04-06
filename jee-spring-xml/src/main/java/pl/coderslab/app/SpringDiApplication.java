package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;
import pl.coderslab.beans.MessageService;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//        helloWorld.printMessage();
//        System.out.println(helloWorld.getMessage());
//
//        MessageService emailService = context.getBean("messageService", MessageService.class);
//        emailService.send();

        MessageSender messageSender = context.getBean("messageSender", MessageSender.class);
        messageSender.sendMessage();
        messageSender.sendMessageFromProperty();


        context.close();
    }
}
