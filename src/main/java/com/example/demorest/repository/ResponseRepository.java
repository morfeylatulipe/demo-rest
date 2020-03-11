package com.example.demorest.repository;

import com.example.demorest.domain.Response;
import com.example.demorest.repository.mapper.ResponseRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ResponseRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Response> findAllByUserId(Long userId) {
        return jdbcTemplate.query("select * from responses where userId = ?", new Object[]{userId},
                new ResponseRowMapper());
    }

    public int save(Response response) {
        return jdbcTemplate.update("insert into responses (userId, questionId, responseValue) values(?, ?, ?)",
                response.getUserId(), response.getQuestionId(), response.getResponseValue());
    }
}
