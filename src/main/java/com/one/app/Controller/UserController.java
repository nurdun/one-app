package com.one.app.Controller;

import java.util.ArrayList;
import java.util.List;

import com.one.app.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.one.app.POJO.User;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @RequestMapping("/users")
    @ResponseBody
    public List<User> getUsers(){
        List<User> result = new ArrayList<User>();
        result =  userService.getUsers();
        return result;
    }

    @RequestMapping(method = POST,value = "/getuser")
    @ResponseBody
    public User getUserById(int userId){
        User user = new User();
        user =  userService.getUserById(userId);
        return user;
    }

    @RequestMapping(method = POST,value = "/adduser")
    @ResponseBody
    public String addUser(User user){
        return userService.addUser(user);
    }

    @RequestMapping(method = POST,value = "/updateuser")
    @ResponseBody
    public int updateUser(User user){
        return userService.updateUser(user);
    }

    @RequestMapping(method = POST,value = "/deleteuser")
    @ResponseBody
    public String addUser(int userId){
        return userService.deleteUserById(userId);
    }
 }
