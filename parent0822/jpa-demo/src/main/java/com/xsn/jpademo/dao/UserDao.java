package com.xsn.jpademo.dao;

import com.xsn.jpademo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository 泛型User实体类 Integer -> 主键类型
public interface UserDao extends JpaRepository<User,Integer> {

}
