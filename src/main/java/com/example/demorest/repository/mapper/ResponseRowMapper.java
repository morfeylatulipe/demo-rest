package com.example.demorest.repository.mapper;

import com.example.demorest.domain.Response;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResponseRowMapper implements RowMapper<Response> {

    @Override
    public Response mapRow(ResultSet rs, int rowNum) throws SQLException {
        Response response = new Response();
        response.setId(rs.getLong("id"));
        response.setUserId(rs.getLong("userId"));
        response.setQuestionId(rs.getLong("questionId"));
        response.setResponseValue(rs.getLong("responseValue"));
        return response;
    }
}
