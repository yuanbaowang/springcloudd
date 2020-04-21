package com.yuanbw.springcloudd.serviceuser.controller;

import com.yuanbw.springcloudd.serviceuser.service.UserService;
import com.yuanbw.springcloudd.serviceuserinterface.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    public User getUser(Integer id){
        User user =  userService.getUserById(id);
        return user;
    }

    @RequestMapping("/getUserName")
    public String getUserName(Integer id){
        String user =  userService.getUserByName(id);
        return user;
    }
}
