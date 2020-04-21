package com.yuanbw.springcloudd.serviceuserorder.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced //实现负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 配置负载均衡算法
     *
     */
    @Bean
    public IRule iRule(){
        //这是一个随机算法
        //return new RandomRule();
        //这是一个轮询的算法
        return new RoundRobinRule();
    }
}
