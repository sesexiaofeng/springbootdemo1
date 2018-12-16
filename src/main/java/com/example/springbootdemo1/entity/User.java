package com.example.springbootdemo1.entity;

import javax.persistence.*;

/**
 * @Author: wufeng
 * @Description:
 * @Date: 2018/12/9
 */

@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", nullable = false,length = 30)
    private String userName;

    @Column(name = "user_pwd", nullable = false,length = 100)
    private String userPwd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
