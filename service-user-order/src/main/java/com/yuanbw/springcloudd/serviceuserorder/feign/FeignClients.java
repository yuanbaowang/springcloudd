package com.yuanbw.springcloudd.serviceuserorder.feign;

import com.yuanbw.springcloudd.serviceuserinterface.user.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  feign指定了serrvice-user 客户端
 *  如果其他客户端想要调用这个同一个接口
 *  的话  把它放在接口工程 就不需要重新编写
 */
@FeignClient(name = "service-user")
public interface FeignClients {

    @RequestMapping("/getUser")
    public User getUser(Integer id);


    @RequestMapping("/getUserName")
    public String getUserName(Integer id);

    @RequestMapping("/getUserByUser")
    public User getUserByUser(User user);
}
