package com.example.demorest.controller;

import com.example.demorest.domain.Question;
import com.example.demorest.domain.Response;
import com.example.demorest.dto.ResponseRequest;
import com.example.demorest.repository.QuestionRepository;
import com.example.demorest.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/response")
public class ResponseController {
    @Autowired
    ResponseService responseService;

    @GetMapping("byUserId/{userId}")
    public ResponseEntity<List<Response>> getResponsesByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(responseService.getResponsesByUserId(userId));
    }

    @PostMapping
    public ResponseEntity<Integer> createResponse(@RequestBody ResponseRequest responseRequest) {
        return ResponseEntity.ok(responseService.createResponse(responseRequest));
    }
}
