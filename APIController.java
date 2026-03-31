#APIController

package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("message", "hello");
    }

    @PostMapping("/data")
    public Map<String, Object> post(@RequestBody Map<String, Object> body) {
        return body;
    }
}
