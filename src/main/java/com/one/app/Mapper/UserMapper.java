package com.one.app.Mapper;

import com.one.app.POJO.User;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface UserMapper {

    void creatTableNotExist();

//   @Select("select * from users where userId = #{userId}")
    User getUserById(String userId);

//    @Select("select * from users")
    List<User> getUsers();

//    @Insert("insert into users (userName,gender,age) values (#{userName},#{gender},#{age})")
    void addUser(User user);

//    @Update("update users set userName = #{userName},gender = #{gender}, age = #{age} where userId = #{userId}")
    int updateUser(User user);

//    @Delete("delete from users where userId=#{userId}")
    void deleteUserById(String userId);
}
