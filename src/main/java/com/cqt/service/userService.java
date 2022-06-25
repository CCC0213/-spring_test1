package com.cqt.service;


import com.cqt.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class userService {

    @Autowired
    private userMapper userMapper1;

    /*@Transactional
    public void test(){
        userMapper1.insertOne();
    }*/
    @Transactional
    public void getUser(){
        userMapper1.getUser();
    }

}
