package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class MessagePrinter {
    public MessagePrinter() {
        super();
        System.out.println("messageprinter被创建");
    }

    private MessageService messageService;


    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage(){
        System.out.println(this.messageService.getMessage());
    }

}
