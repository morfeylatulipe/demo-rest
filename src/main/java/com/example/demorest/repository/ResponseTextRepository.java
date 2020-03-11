package com.example.demorest.repository;

import com.example.demorest.domain.ResponseText;
import com.example.demorest.repository.mapper.ResponseTextRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

@Repository
public class ResponseTextRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public ResponseText findById(Long responseTextId) {
        return jdbcTemplate.queryForObject("select * from response_text where id = ?", new Object[]{responseTextId},
                new ResponseTextRowMapper());
    }

    public long insertResponseText(String responseText) {
        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement statement = connection.prepareStatement("insert into response_text (responseText) values(?)",
                        Statement.RETURN_GENERATED_KEYS);
                statement.setString(1, responseText);
                return statement;
            }
        }, keyHolder);

        return Objects.requireNonNull(keyHolder.getKey()).longValue();
    }
}
