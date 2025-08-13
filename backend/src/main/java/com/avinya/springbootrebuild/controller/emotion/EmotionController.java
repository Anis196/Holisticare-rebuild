package com.avinya.springbootrebuild.controller.emotion;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emotion")
public class EmotionController {
    @PostMapping("/detect")
    public Map<String, String> detectEmotion(@RequestBody Map<String, Object> payload) {
        // Placeholder for emotion detection logic
        Map<String, String> result = new HashMap<>();
        result.put("emotion", "happy");
        return result;
    }
}
