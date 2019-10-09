package com.one.app.DAO;

import com.one.app.Model.User;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    User user;

    private String  getUserListSql = "Select * from users";


    public List<User> getUsers(){
        String usersSql = "select * from users";
        return jdbcTemplate.query(usersSql,new BeanPropertyRowMapper<>(User.class));
    }
}
