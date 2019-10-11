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

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @RequestMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @RequestMapping(method = POST,value = "/getuser")
    public User getUserById(int userId){
        return userService.getUserById(userId);
    }

    @RequestMapping(method = POST,value = "/adduser")
    public String addUser(User user){
        return userService.addUser(user);
    }

    @RequestMapping(method = POST,value = "/updateuser")
    public int updateUser(User user){
        return userService.updateUser(user);
    }

    @RequestMapping(method = POST,value = "/deleteuser")
    public String addUser(int userId){
        return userService.deleteUserById(userId);
    }
 }