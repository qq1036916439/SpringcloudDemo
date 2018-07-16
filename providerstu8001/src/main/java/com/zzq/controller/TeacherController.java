package com.zzq.controller;


import com.zzq.service.TeacherService;
import com.zzq.utils.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @RequestMapping(method = RequestMethod.POST,value = "/teacher/list")
    public PageUtil getTeaList(@RequestParam(value = "currentPage") Integer currentPage){
        PageUtil page = teacherService.page(currentPage);
        return page;
    }

    @PostMapping("/teacher/del")
    public String deleteTeabyId(@RequestParam("ids[]")Integer[] ids){
        if(ids==null){
            return 0+" ";
        }
        int i = teacherService.deleteTeabyId(ids);
        return "i";
    }
   /* @GetMapping("/teacher/list")
    public String gerTeaList(Model model){
        List<Tea> teaList = teacherService.getTeaList();
        model.addAttribute("teacherlist",teaList);
        return "member-list";
    }*/

}
