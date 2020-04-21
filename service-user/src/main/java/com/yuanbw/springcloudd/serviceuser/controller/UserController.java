package com.yuanbw.springcloudd.serviceuser.controller;

import com.yuanbw.springcloudd.serviceuser.service.UserService;
import com.yuanbw.springcloudd.serviceuserinterface.user.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    public User getUser(Integer id){
        log.info("userId::::"+id);

        User user =  userService.getUserById(id);
        log.info("user::::"+user);
        return user;
    }

    @RequestMapping("/getUserName")
    public String getUserName(Integer id){
        String user =  userService.getUserByName(id);
        return user;
    }

    @RequestMapping("/getUserByUser")
    public User getUser(User user){
        log.info("userId::::"+user.getId());
        User user2 =  userService.getUserByUser(user);
        log.info("user::::"+user2);
        return user2;
    }

}
