package com.example.springbootdemo1.dao;

import com.example.springbootdemo1.entity.User;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;


/**
 * @Author: wufeng
 * @Description:
 * @Date: 2018/12/9
 */

@Transactional
public interface UserDao extends JpaRepository<User, Long> {

    User findByUserName(@Param("userName") String userName);

}
