package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/studentService")
public class StudentController {

    @Autowired
    StudentService studentService ;

    //save Student
    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    //get all students
    @GetMapping("/getAllStudents")
    public List<Student>getAllStudents(){
        return studentService.getAllStudents();
    }

    //Get student by id 
    @GetMapping("/getStudent/{id}")
    public Student getStudentById(@PathVariable("id") Integer id){
        return  studentService.getStudentById(id);
    }

    //Update Student
    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    //Delete student by Id
    @DeleteMapping("/deleteStudentById/{id}")
    public void deleteStudentById(@PathVariable("id") Integer studentId){//@PathVariable is a annotation used to extract values from the url path. Integer ensures that the value extracted treated as an interger
        studentService.deleteStudentById(studentId);
    }

    //
}
