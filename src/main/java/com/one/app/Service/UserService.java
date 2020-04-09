package com.one.app.Service;

import com.one.app.POJO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.one.app.Mapper.UserMapper;
import com.one.app.Util.RestService;

@Service
public class UserService extends RestService {

    @Autowired
    UserMapper userMapper;
//    UserDao userDao;
//    @Deprecated
//    public List<User> getUsers(){
//        return userDao.getUsers();
//    }

    public User getUserById(String userId){
        userTableIntialize();
        return userMapper.getUserById(userId);
    }

    public List<User> getUsers(){
        userTableIntialize();
        return userMapper.getUsers();
    }

    public  String addUser(User user){
        try{
            userTableIntialize();
//            String result = "Succeed";
            userMapper.addUser(user);
            return addSucceed;
        }catch (Exception err){
            return err.toString();
        }
    }

    public int updateUser(User user){
        userTableIntialize();
       return userMapper.updateUser(user);
    }

    public String deleteUserById (String userId){
        try {
            userTableIntialize();
            userMapper.deleteUserById(userId);
            return deleteSucceed;
        }catch (Exception err){
            return err.toString();
        }
    }


    public void userTableIntialize(){
        userMapper.creatTableNotExist();
    }
}
