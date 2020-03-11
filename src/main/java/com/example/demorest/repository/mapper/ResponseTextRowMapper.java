package com.example.demorest.repository.mapper;

import com.example.demorest.domain.ResponseText;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResponseTextRowMapper implements RowMapper<ResponseText> {

    @Override
    public ResponseText mapRow(ResultSet rs, int rowNum) throws SQLException {
        ResponseText responseText = new ResponseText();
        responseText.setId(rs.getLong("id"));
        responseText.setResponseText(rs.getString("responseText"));
        return responseText;
    }
}
