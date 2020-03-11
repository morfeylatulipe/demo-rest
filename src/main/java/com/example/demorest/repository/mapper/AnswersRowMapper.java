package com.example.demorest.repository.mapper;

import com.example.demorest.domain.Answers;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AnswersRowMapper implements RowMapper<Answers> {
    @Override
    public Answers mapRow(ResultSet rs, int rowNum) throws SQLException {
        Answers answers = new Answers();
        answers.setId(rs.getLong("id"));
        answers.setTitle(rs.getString("title"));
        answers.setQuestionId(rs.getLong("questionId"));
        answers.setStatus(rs.getLong("status"));
        return answers;
    }
}
