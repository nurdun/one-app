package com.one.app.Mapper;

import com.one.app.Model.User;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface UserMapper {

//    @Select("select * from users where userId = #{userId}")
    User getUserById(int userId);

//    @Select("select * from users")
    List<User> getUsers();

//    @Insert("insert into users (userName,gender,age) values (#{userName},#{gender},#{age})")
    void addUser(User user);

//    @Update("update users set userName = #{userName},gender = #{gender}, age = #{age} where userId = #{userId}")
    int updateUser(User user);

//    @Delete("delete from users where userId=#{userId}")
    void deleteUserById(int userId);
}