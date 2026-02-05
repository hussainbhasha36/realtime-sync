package com.example.realtime;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class TextController {

    @MessageMapping("/send")
    @SendTo("/topic/liveText")
    public String sendText(String text) {
        return text;
    }
}
