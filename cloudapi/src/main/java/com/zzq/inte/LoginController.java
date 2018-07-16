package com.zzq.inte;

import com.zzq.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@FeignClient(value = "PROVIDERSTUD")
public interface LoginController {
    @RequestMapping("/log")
    public String UserPast(User user, HttpServletRequest request);

}