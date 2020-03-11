package com.example.demorest.repository.mapper;

import com.example.demorest.domain.Question;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionRowMapper implements RowMapper<Question> {
    @Override
    public Question mapRow(ResultSet rs, int rowNum) throws SQLException {
        Question question = new Question();
        question.setId(rs.getLong("id"));
        question.setTitle(rs.getString("title"));
        question.setType(rs.getInt("type"));
        return question;
    }
}