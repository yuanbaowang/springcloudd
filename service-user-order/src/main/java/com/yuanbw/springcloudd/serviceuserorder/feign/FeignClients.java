package com.yuanbw.springcloudd.serviceuserorder.feign;

import com.yuanbw.springcloudd.serviceuserinterface.user.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "service-user")
public interface FeignClients {

    @RequestMapping("/getUser")
    public User getUser(Integer id);

    @RequestMapping("/getUserName")
    public String getUserName(Integer id);

    @RequestMapping("/getUserByUser")
    public User getUserByUser(User user);
}
