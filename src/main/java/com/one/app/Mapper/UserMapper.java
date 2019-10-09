package com.one.app.Mapper;

import com.one.app.Model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.MapKey;


import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from users")
    List<User> getUsers();

    @Insert("insert into users (userName,gender,age) values (#{userName},#{gender},#{age})")
    void addUser(User user);
}
