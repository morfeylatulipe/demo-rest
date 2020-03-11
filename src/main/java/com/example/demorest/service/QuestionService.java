package com.example.demorest.service;

import com.example.demorest.domain.Question;
import com.example.demorest.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return new ArrayList<>(questionRepository.findAll());
    }

    public Question getQuestionById(Long questionId) {
        return questionRepository.findById(questionId);
    }

    public int createQuestion(Question question) {
        return questionRepository.save(question);
    }
}
