package com.xsn.mybatisdemo.dao;

import com.xsn.mybatisdemo.model.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UsersMapper {

    @Select("select * from users where name = #{name}")
    Users findUserByName(@Param("name") String name);

    @Insert("insert into users(name,password) values(#{name},#{password})")
    void insertUser(@Param("name") String name,@Param("password") String password);
}
