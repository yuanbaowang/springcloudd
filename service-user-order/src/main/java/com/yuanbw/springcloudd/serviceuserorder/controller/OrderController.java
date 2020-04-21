package com.yuanbw.springcloudd.serviceuserorder.controller;

import com.yuanbw.springcloudd.serviceuserinterface.user.Order;
import com.yuanbw.springcloudd.serviceuserorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("getOrder")
    public Order getOrder(Integer id){
        return orderService.getUserById(id);
    }

    @RequestMapping("getOrderName")
    public String getOrderName(Integer id){
        return orderService.getUserByName(id);
    }
}
