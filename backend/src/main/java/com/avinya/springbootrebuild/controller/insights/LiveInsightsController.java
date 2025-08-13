package com.avinya.springbootrebuild.controller.insights;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/insights")
public class LiveInsightsController {
    @GetMapping("/live")
    public Map<String, Object> getLiveInsights() {
        // Placeholder for live insights logic
        Map<String, Object> result = new HashMap<>();
        result.put("insight", "You are doing great!");
        return result;
    }
}
