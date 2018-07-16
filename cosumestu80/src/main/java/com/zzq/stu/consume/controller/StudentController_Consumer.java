package com.zzq.stu.consume.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController

public class StudentController_Consumer {
 //private static final String REST_URL_PREFIX="http://localhost:8001";
 private static final String REST_URL_PREFIX="http://PROVIDERSTUD";
    @Autowired
    private RestTemplate restTemplate;
@GetMapping("/cusumer/stu/sel")
public  List selectAllStu(){
    return restTemplate.getForObject(REST_URL_PREFIX+"/stu/select",List.class);
}

}
