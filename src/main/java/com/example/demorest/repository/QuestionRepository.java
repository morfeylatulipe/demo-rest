package com.example.demorest.repository;

import com.example.demorest.domain.Question;
import com.example.demorest.repository.mapper.QuestionRowMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Question> findAll() {
        return jdbcTemplate.query("select * from questions", new QuestionRowMapper());
    }


    public Question findById(Long questionId) {
        return jdbcTemplate.queryForObject("select * from questions where id=?", new Object[]{questionId},
                new QuestionRowMapper());
    }

    public int save(Question question) {
        return jdbcTemplate.update("insert into questions (title, type ) values(?, ?)",
                question.getTitle(), question.getType());
    }

    public Long countQuestions() {
        return jdbcTemplate.queryForObject("select count(*) from question", Long.class);
    }
}
