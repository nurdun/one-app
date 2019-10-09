package com.one.app.Service;

import com.one.app.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.one.app.DAO.UserDao;
import com.one.app.Mapper.UserMapper;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
//    UserDao userDao;
//    @Deprecated
//    public List<User> getUsers(){
//        return userDao.getUsers();
//    }

    public List<User> getUsers(){
        return userMapper.getUsers();
    }

    public  String addUser(User user){
        try{
            String result = "Succeed";
            userMapper.addUser(user);
            return result;
        }catch (Exception err){
            return err.toString();
        }
    }
}
