package com.example.dev_kolibri_app; 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello from Spring Boot!");
        response.put("team", "dev-kolibri");
        response.put("indexes", Arrays.asList("77433", "75545", "77426")); // indexes our team
        return response;
    }
}