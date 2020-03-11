package com.example.demorest.service;

import com.example.demorest.domain.Answers;
import com.example.demorest.repository.AnswersRepository;
import com.example.demorest.repository.StatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticService {
    @Autowired
    StatisticRepository statisticRepository;

    public Long getUsersCount() {
        return statisticRepository.countAllUsers();
    }

    public Long getTestingUsersCount() {
        return statisticRepository.countAllUsersWithResponses();
    }

    public Long getTestedUsersCount() {
        return statisticRepository.countAllUsersWithAllResponses();
    }

    public Long getValidTestedUsersCount() {
        return statisticRepository.countAllUsersWithAllValidResponses();
    }
}
