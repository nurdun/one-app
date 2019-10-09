package com.one.app.Controller;

import java.lang.Object;
import java.util.List;

import com.one.app.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.jdbc.core.JdbcTemplate;

import com.one.app.Model.User;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @RequestMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
 }
