package pl.coderslab.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MessageSender {
    private MessageService messageService;
    private String message;

    public void sendMessage() {
        messageService.send();
    }

    public void sendMessageFromProperty(){
        messageService.send(message);
    }

}
