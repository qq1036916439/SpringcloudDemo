package com.zzq.stu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.zzq.stu.dao")
@SpringBootApplication
@EnableEurekaClient
public class Appliaction8003 {
    public static void main(String[] args) {
        SpringApplication.run(Appliaction8003.class,args);
    }
}
