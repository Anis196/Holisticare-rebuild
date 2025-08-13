package com.avinya.springbootrebuild.controller.chat;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
public class ChatController {
    @GetMapping("/messages")
    public List<String> getMessages() {
        // Placeholder for chat messages
        return Arrays.asList("Hello! How can I help you?", "What is your concern today?");
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody String message) {
        // Placeholder for sending a message
        return "Message received: " + message;
    }
}
