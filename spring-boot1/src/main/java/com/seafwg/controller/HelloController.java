package com.seafwg.controller;

import com.seafwg.pojo.User;
import com.seafwg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;


@RestController
public class HelloController {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserService userService;
//    @Autowired
//    private DataSource dataSourceDruid;
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.queryById(id);
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("dataSource="+dataSource);
//        System.out.println("dataSourceDruid="+dataSourceDruid);
        return "hello spring boot";
    }
}
