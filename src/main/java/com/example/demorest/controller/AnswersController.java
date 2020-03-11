package com.example.demorest.controller;

import com.example.demorest.domain.Answers;
import com.example.demorest.dto.AnswersRequest;
import com.example.demorest.service.AnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswersController {
    @Autowired
    AnswersService answersService;

    @GetMapping("byQuestionId/{questionId}")
    public ResponseEntity<List<Answers>> getAnswersByQuestionId(@PathVariable Long questionId) {
        return ResponseEntity.ok(answersService.getAnswersByQuestionId(questionId));
    }

    @PostMapping
    public ResponseEntity<Integer> createAnswers(@RequestBody AnswersRequest answersRequest) {
        Answers answers = new Answers();
        answers.setTitle(answersRequest.getTitle());
        answers.setQuestionId(answersRequest.getQuestionId());
        return ResponseEntity.ok(answersService.createAnswers(answers));
    }
}
