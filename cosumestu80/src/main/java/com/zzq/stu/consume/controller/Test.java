package com.zzq.stu.consume.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
@Value("${name}")
 private String name;

    @GetMapping("/test")
    public String test(){
        return name;
    }
}
