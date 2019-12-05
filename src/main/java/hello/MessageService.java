package hello;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public MessageService() {
        super();
        System.out.println("messageservice被创建");
    }

    public String getMessage(){
        return "helloworld";
    }
}
