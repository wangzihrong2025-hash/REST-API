#ApiController

package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    // GET
    @GetMapping("/hello")
    public Map<String, String> hello() {
        System.out.println("GET /hello called");
        return Map.of("message", "hello");
    }

    // POST
    @PostMapping("/data")
    public Map<String, Object> post(@RequestBody Map<String, Object> body) {
        System.out.println("POST /data called");

        if (body == null || body.isEmpty()) {
            return Map.of("error", "no data");
        }

        return body;
    }

    // 測試錯誤
    @GetMapping("/error")
    public Map<String, String> error() {
        return Map.of("error", "test error");
    }
}
