package com.zzq.inte;

import com.zzq.pojo.Curriculum;
import com.zzq.pojo.Student;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "PROVIDERSTUD")
public interface CurriculumControler {
    @GetMapping("/curriculum/sel/{id}")
    public String getTeacherbyId(@PathVariable("id") Integer id, Model model);
    @ResponseBody
    @PostMapping("/curriculum/add")
    public String addStudent(Curriculum curriculum, @RequestParam(defaultValue = "0") Integer status);
    @GetMapping("/curriculum/addView")
    public String addStudentView(Student stu, Model model);
    @GetMapping(value = "/curriculum/list")
    public String getTeaList(@RequestParam(defaultValue = "1")Integer currentPage, Model model);
      @ResponseBody
    @GetMapping("/curriculumid/list")
    public List<Curriculum> getCurList();

    @ResponseBody
    @PostMapping("/curriculum/del")
    public String deleteTeabyId(@RequestParam("ids[]")Integer[] ids);

}
