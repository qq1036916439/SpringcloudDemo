package com.zzq.inte;

import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 进行视图解析
 */

@FeignClient(value = "PROVIDERSTUD")
public interface Viewresolution {
    @RequestMapping("/welcome.html")
    public String Welcome();

   /* @RequestMapping("/member-list.html")
    public String Memberlist(){
        return "member-list";
    }*/

    @RequestMapping("/member-del.html")
    public String MemberDel();
    @RequestMapping("/order-list.html")
    public String OrderList();
    @RequestMapping("/admin-list.html")
    public String Adminlist();
    @RequestMapping("/admin-cate.html")
    public String AdminCate();
  @RequestMapping("/admin-role.html")
    public String AdminRole();
    @RequestMapping("/admin-rule.html")
    public String AdminRule();

    @RequestMapping("/login.html")
    public String Login();
    @RequestMapping("/")
    public String demo();
}
