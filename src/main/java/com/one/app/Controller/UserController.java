package com.one.app.Controller;

import java.util.ArrayList;
import java.util.List;

import com.one.app.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.one.app.POJO.User;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/api")
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
    public User getUserById(@RequestParam String userId){
        User user = new User();
        user =  userService.getUserById(userId);
        return user;
    }

    @RequestMapping(method = POST,value = "/adduser",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @RequestMapping(method = POST,value = "/updateuser",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public int updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @RequestMapping(method = POST,value = "/deleteuser")
    @ResponseBody
    public String addUser(@RequestParam String userId){
        return userService.deleteUserById(userId);
    }
 }
