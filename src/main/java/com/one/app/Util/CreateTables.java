package com.one.app.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTables {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private String usersTableSql =  "CREATE  TABLE IF NOT EXISTS users" +
            "(userId varchar(255) NOT NULL," +
            "userName varchar(255) NOT NULL," +
            "email varchar(255) NOT NULL"+
            "country varchar(255) NOT NULL"+
            "gender varchar(255)," +
            "Age int," +
            "createTime Timestamp, "+
            "updateTime Timestamp, "+
            "PRIMARY KEY (userId)" +
            ")";

    public void create(){
        jdbcTemplate.execute(usersTableSql);
    }
}
