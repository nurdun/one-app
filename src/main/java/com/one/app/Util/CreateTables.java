package com.one.app.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTables {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private String usersTableSql =  "CREATE  TABLE IF NOT EXISTS users" +
            "(userId int NOT NULL AUTO_INCREMENT," +
            "userName varchar(255) NOT NULL," +
            "gender varchar(255)," +
            "Age int," +
            "PRIMARY KEY (userId)" +
            ")";

    public void create(){
        jdbcTemplate.execute(usersTableSql);
    }
}
