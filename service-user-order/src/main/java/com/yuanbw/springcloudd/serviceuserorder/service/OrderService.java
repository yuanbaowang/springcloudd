package com.yuanbw.springcloudd.serviceuserorder.service;

import com.yuanbw.springcloudd.serviceuserinterface.user.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public Order getUserById(Integer id) {
        Order user = new Order();
        user.setId(id);
        user.setOrderNu("13424564");
        user.setName("憨憨礼包");
        return user;
    }

    public String getUserByName(Integer id) {
        Order user = getUserById(id);
        return user.getName();
    }

}
