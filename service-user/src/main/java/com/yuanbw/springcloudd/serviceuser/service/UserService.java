package com.yuanbw.springcloudd.serviceuser.service;

import com.yuanbw.springcloudd.serviceuserinterface.user.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setAge(26);
        user.setName("憨憨"+id);
        user.setSex("女");
        return user;
    }

    public String getUserByName(Integer id) {
        User user = getUserById(id);
        return user.getName();
    }

    public User getUserByUser(User user1) {
        User user = new User();
        user.setId(user1.getId());
        user.setAge(24);
        user.setName("铁憨憨"+user.getId());
        user.setSex("女");
        return user;
    }

}
