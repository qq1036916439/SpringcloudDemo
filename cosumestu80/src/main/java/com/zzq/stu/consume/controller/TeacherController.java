package com.zzq.stu.consume.controller;


import com.zzq.pojo.Tea;
import com.zzq.utils.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Slf4j
@Controller
public class TeacherController {
    @Autowired
    private com.zzq.inte.TeacherController teacherController;

    @RequestMapping(method = RequestMethod.GET,value = "/teacher/list")
    public String getTeaList(@RequestParam(defaultValue = "1") Integer currentPage, Model model){
             PageUtil teaList = teacherController.getTeaList(currentPage);
            model.addAttribute("page",teaList);
            return "member-list";
    }

   /* @GetMapping("/teacher/list")
    public String gerTeaList(Model model){
        List<Tea> teaList = teacherService.getTeaList();
        model.addAttribute("teacherlist",teaList);
        return "member-list";
    }*/

@ResponseBody
     @RequestMapping(method = RequestMethod.POST,value = "/teacher/del")
    public String deleteTeabyId(@RequestParam("ids[]")Integer[] ids){
        String s = teacherController.deleteTeabyId(ids);
        return ""+s;
    }
    @GetMapping("/teacher/addView")
    public String addTeaView(){
       return "member-add";
    }
    @ResponseBody
    @PostMapping("/teacher/add")
    public String addTea(Tea tea){
        int i = new Integer(teacherController.addTea(tea));
        if(i>=1)
            return "200";

        return "100";
    }
    @GetMapping("/teacher/sel/{id}")
    public String getTeacherbyId(@PathVariable("id") Integer id, Model model){
        Tea teacherbyId = teacherController.getTeacherbyId(id);
        model.addAttribute("tea",teacherbyId);
        return "member-add";
    }

}
