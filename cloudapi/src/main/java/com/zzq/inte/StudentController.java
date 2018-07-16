package com.zzq.inte;

import com.zzq.pojo.Student;

import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "PROVIDERSTUD")
public interface StudentController {

    @GetMapping("/student/sel/{id}")
    public String getTeacherbyId(@PathVariable("id") Integer id, Model model);

   @ResponseBody
    @GetMapping("/student/sel/json")
    public List<Student> getSelectStu();

    @ResponseBody
    @PostMapping("/student/add")
    public String addStudent(Student student);
    @GetMapping("/student/addView")
    public String addStudentView(Student stu, Model model);

    @GetMapping("/student/list")
    public String getTeaList(@RequestParam(defaultValue = "1")Integer currentPage, Model model);
    @ResponseBody
    @PostMapping("/student/del")
    public String deleteTeabyId(@RequestParam("ids[]")Integer[] ids);

}
