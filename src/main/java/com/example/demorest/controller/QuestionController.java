package com.example.demorest.controller;

import com.example.demorest.domain.Question;
import com.example.demorest.dto.QuestionRequest;
import com.example.demorest.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping
    public ResponseEntity<List<Question>> getQuestionsList() {
        return ResponseEntity.ok(questionService.getAllQuestions());
    }

    @PostMapping
    public ResponseEntity<Integer> createQuestion(@RequestBody QuestionRequest questionRequest) {
        Question question = new Question();
        question.setTitle(questionRequest.getTitle());
        question.setType(questionRequest.getType());
        return ResponseEntity.ok(questionService.createQuestion(question));
    }
}
