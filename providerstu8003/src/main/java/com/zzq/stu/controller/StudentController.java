package com.zzq.stu.controller;

import com.zzq.entity.Student;
import com.zzq.stu.service.StudentSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentSevice studentSevice;
   @GetMapping("stu/select")
    public List<Student> getAllStuent() {
       List<Student>  list= studentSevice.getAllStuent();
       Student student= list.get(0);
       student.setName("003");
       return list;
    }
}
