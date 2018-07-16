package com.zzq.inte;

import com.zzq.pojo.Tea;
import com.zzq.utils.PageUtil;
import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.web.bind.annotation.*;

@FeignClient(value = "PROVIDERSTUD")
public interface TeacherController {

@RequestMapping(method = RequestMethod.POST,value = "/teacher/list")
    PageUtil getTeaList(@RequestParam(value = "currentPage")Integer currentPage);


   /* @GetMapping("/teacher/list")
    public String gerTeaList(Model model){
        List<Tea> teaList = teacherService.getTeaList();
        model.addAttribute("teacherlist",teaList);
        return "member-list";
    }*/

 @RequestMapping(method = RequestMethod.POST,value = "/teacher/del")
    public String deleteTeabyId(@RequestParam(value = "ids[]")Integer[] ids);
 @RequestMapping(method = RequestMethod.GET,value = "/teacher/del")
 public String addTeaView();
 @RequestMapping(method = RequestMethod.POST,value = "/teacher/del")
    public String addTea(@RequestParam(value = "currentPage")Tea tea);
 @RequestMapping(method = RequestMethod.GET,value = "/teacher/sel/{id}")
    public Tea getTeacherbyId(@RequestParam(value = "id")Integer id);
}
