package com.zzq.stu.service.impl;

import com.zzq.entity.Student;
import com.zzq.stu.dao.StudentMapper;
import com.zzq.stu.service.StudentSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentSevice {
   @Autowired
   private StudentMapper studentMapper;
    @Override
    public List<Student> getAllStuent() {

        return studentMapper.selectByExample(null);
    }
}
