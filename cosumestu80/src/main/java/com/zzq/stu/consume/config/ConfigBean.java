package com.zzq.stu.consume.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
@Bean
@LoadBalanced //开启客户端负载均衡

/**
 * 默认的是使用轮训算法
 */
public RestTemplate getRestTemplate(){
    return new RestTemplate();
}

/*@Bean
    public IRule myRule(){      //开启随机访问算法
    return new RandomRule();
}*/

}
