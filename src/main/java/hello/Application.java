package hello;

import javafx.print.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class Application {
    public static void main(String[] args) {
        // 初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        MessagePrinter printer = context.getBean(MessagePrinter.class);
//        MessageService service = context.getBean(MessageService.class);
//        printer.setMessageService(service);
        printer.printMessage();


    }
}
