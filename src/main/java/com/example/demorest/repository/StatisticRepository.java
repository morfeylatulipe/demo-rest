package com.example.demorest.repository;

import com.example.demorest.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StatisticRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    QuestionRepository questionRepository;

    public Long countAllUsers() {
        return jdbcTemplate.queryForObject("select count(*) from users", Long.class);
    }

    public Long countAllUsersWithResponses() {
        return jdbcTemplate.queryForObject("select count(*) from responses group by userId", Long.class);
    }

    public Long countAllUsersWithAllResponses() {
        Long countQuestions = questionRepository.countQuestions();

        return jdbcTemplate.queryForObject("SELECT userid, count(*) count FROM responses group by userid having count = ?",
                new Object[]{countQuestions},
                Long.class);
    }

    public Long countAllUsersWithAllValidResponses() {
        Long countQuestions = questionRepository.countQuestions();

        return jdbcTemplate.queryForObject("select userid, count(*) count from (SELECT responses.userid, questions.id qid, questions.type qtype, case when questions.type = 1 then 1 else answers.status end astatus FROM RESPONSES join questions on responses.questionid = questions.id left join answers on questions.id = answers.questionid and answers.status = 1) where astatus = 1 group by userid having count = ?",
                new Object[]{countQuestions},
                Long.class);
    }
}
