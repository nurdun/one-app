package com.one.app.Repository;

import com.one.app.POJO.User;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    User user;

    private String  getUserListSql = "Select * from users";


    public List<User> getUsers(){
        String usersSql = "select * from users";
        return jdbcTemplate.query(usersSql,new BeanPropertyRowMapper<>(User.class));
    }
}
