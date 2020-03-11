package com.example.demorest.controller;

import com.example.demorest.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/statistic")
public class StatisticController {
    @Autowired
    StatisticService statisticService;

    @GetMapping
    public ResponseEntity<Map<String, Long>> getStatistic() {

        Map<String, Long> response = new HashMap<String, Long>();
        response.put("usersCount", statisticService.getUsersCount());
        response.put("testingUsersCount", statisticService.getTestingUsersCount());
        response.put("testedUsersCount", statisticService.getTestedUsersCount());
        response.put("validTestedUsersCount", statisticService.getValidTestedUsersCount());
        return ResponseEntity.ok(response);
    }
}
