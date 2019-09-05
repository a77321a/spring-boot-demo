package com.xsn.redisdemo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.xsn.redisdemo.model.Users;

public interface UsersMapper {

    @Select("select * from users where name = #{name}")
    Users findUserByName(@Param("name") String name);

    @Insert("insert into users(name,password) values(#{name},#{password})")
    void insertUser(@Param("name") String name, @Param("password") String password);
}
