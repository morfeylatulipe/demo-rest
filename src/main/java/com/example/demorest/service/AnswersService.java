package com.example.demorest.service;

import com.example.demorest.domain.Answers;
import com.example.demorest.repository.AnswersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswersService {
    @Autowired
    AnswersRepository answersRepository;

    public List<Answers> getAnswersByQuestionId(Long questionId) {
        return answersRepository.findAllByQuestionId(questionId);
    }

    public int createAnswers(Answers answers) {
        return answersRepository.save(answers);
    }
}
