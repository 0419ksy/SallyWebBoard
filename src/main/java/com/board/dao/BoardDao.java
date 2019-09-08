package com.board.dao;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.Map;

@Repository
public class BoardDao {
    NamedParameterJdbcTemplate jdbc;

    final String COUNT_BOARD = "SELECT count(*) FROM board";

    public int countBooks() {
        Map<String, Object> params = Collections.emptyMap();
        return jdbc.queryForObject(COUNT_BOARD, params, Integer.class);
    }
}
