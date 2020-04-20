package com.yuanbaowang.springcloudd.consulclient.controller;

import com.yuanbaowang.springcloudd.consulclient.config.ConsulConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
//    @Value("${config.info}")
//    private String config;
//
    @Autowired
    ConsulConfigInfo config;



    @RequestMapping("getconfig")
    public Object getConfig(){
        return config;
    }
}
