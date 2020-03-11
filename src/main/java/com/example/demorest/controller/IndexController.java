package com.example.demorest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public ResponseEntity<Map<String, String>> index() {
        Map<String, String> response = new HashMap<String, String>();
        response.put("/h2-console", "H2 Console");
        response.put("GET /question", "Get questions list");
        response.put("POST /question String title, int type | int", "Create question");
        response.put("POST /answers String title, Long questionId, Long status | int", "Create answers");
        response.put("GET /answers/byQuestionId/{questionId} Long questionId | List<Answers>", "Answers list by question");
        response.put("POST /response Long userId, Long questionId, String responseValue | int", "Create response");
        response.put("GET /response/byUserId/{userId} Long userId | List<Response>", "Response list by user");
        response.put("GET /statistic | Map<String, Long>", "Statistic by service");

        return ResponseEntity.ok(response);
    }
}
