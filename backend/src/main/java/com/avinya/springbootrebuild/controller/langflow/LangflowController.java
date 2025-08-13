package com.avinya.springbootrebuild.controller.langflow;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/langflow")
public class LangflowController {

    @PostMapping("/send")
    public ResponseEntity<?> sendLangflowMessage(@RequestBody Map<String, Object> payload) {
        String message = (String) payload.get("message");
        // TODO: Integrate with Langflow or process message as needed
        // For now, just echo the message back
        return ResponseEntity.ok(Map.of("reply", "Received: " + message));
    }
}
