package com.example.springbootdemo1.controller;

import com.example.springbootdemo1.entity.User;
import com.example.springbootdemo1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: wufeng
 * @Description:
 * @Date: 2018/12/9
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/getUserByName/{userName}")
    public User getUserByName(@PathVariable("userName") String userName){
        return  userDao.findByUserName(userName);
    }

    @GetMapping("/getUserById/{id}")
    public User getUserOne(@PathVariable("id") long id){
        return userDao.findById(id).get();
    }

    @RequestMapping("/add")
    public User addUser(User user){
       User result = userDao.save(user);
       return result;
    }

    @RequestMapping("/del/{id}")
    public void deleteUserById(@PathVariable("id") long id){
        userDao.deleteById(id);
    }
}
