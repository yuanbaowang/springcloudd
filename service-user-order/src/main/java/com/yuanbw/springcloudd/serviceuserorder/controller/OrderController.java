package com.yuanbw.springcloudd.serviceuserorder.controller;

import com.netflix.discovery.converters.Auto;
import com.yuanbw.springcloudd.serviceuserinterface.user.Order;
import com.yuanbw.springcloudd.serviceuserinterface.user.User;
import com.yuanbw.springcloudd.serviceuserorder.feign.FeignClients;
import com.yuanbw.springcloudd.serviceuserorder.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    FeignClients feignClients;

    @RequestMapping("getOrder")
    public Order getOrder(Integer id){
        Order order = orderService.getUserById(id);
        //使用restTemplate进行调用
//        User user = restTemplate.getForObject("http://service-user/getUser?id="+order.getId(), User.class);
        //使用feign组件调用 参数是简单类型
        //User user = feignClients.getUser(order.getId());
        User u = new User();
        u.setId(order.getId());
        User user = feignClients.getUserByUser(u);
        log.info("user{}:",user);
        order.setUserName(user.getName());
        return order;
    }

    @RequestMapping("getOrderName")
    public String getOrderName(Integer id){
        return orderService.getUserByName(id);
    }
}
