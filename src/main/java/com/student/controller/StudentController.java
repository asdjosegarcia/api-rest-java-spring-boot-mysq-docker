package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/studentService")
public class StudentController {

    @Autowired
    StudentService studentService;

    //save student
    @PostMapping("/saveStudent") //call the metod save Student from StudentServie.java, PostMapping indicates that http post reques would be proccesed by saveStundent
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    };
}
