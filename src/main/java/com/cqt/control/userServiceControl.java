package com.cqt.control;


import com.cqt.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userServiceControl {

    @Autowired
    private userService userService1;


    @GetMapping("/cqt")
    public void test(){

        userService1.test();
    }
}
