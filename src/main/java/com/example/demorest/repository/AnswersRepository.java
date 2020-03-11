package com.example.demorest.repository;

import com.example.demorest.domain.Answers;
import com.example.demorest.repository.mapper.AnswersRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnswersRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Answers> findAllByQuestionId(Long questionId) {
        return jdbcTemplate.query("select * from answers where questionId = ?", new Object[]{questionId},
                new AnswersRowMapper());
    }

    public int save(Answers answers) {
        return jdbcTemplate.update("insert into answers (title, questionId, status) values(?, ?, ?)",
                answers.getTitle(), answers.getQuestionId(), answers.getStatus());
    }
}
