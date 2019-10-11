package com.one.app.Service;

import com.one.app.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.one.app.DAO.UserDao;
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

    public User getUserById(int userId){
        return userMapper.getUserById(userId);
    }

    public List<User> getUsers(){
        return userMapper.getUsers();
    }

    public  String addUser(User user){
        try{
//            String result = "Succeed";
            userMapper.addUser(user);
            return addSucceed;
        }catch (Exception err){
            return err.toString();
        }
    }

    public int updateUser(User user){
        return userMapper.updateUser(user);
    }

    public String deleteUserById (int userId){
        try {
            userMapper.deleteUserById(userId);
            return deleteSucceed;
        }catch (Exception err){
            return err.toString();
        }
    }
}
