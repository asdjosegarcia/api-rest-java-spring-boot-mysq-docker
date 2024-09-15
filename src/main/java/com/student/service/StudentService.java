package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentRespository;
import com.student.model.Student;

@Service
public class StudentService {

    @Autowired
    StudentRespository StudentRespository;

    //Save Student
    public Student saveStudent (Student student){
        return StudentRespository.save(student);
    }

    //Get All student
    public List<Student> getAllStudents(){
        return StudentRespository.findAll();
    }

    //Get Student by Id
    public Student getStudentById(int id){
        return StudentRespository.findById(id).orElse(null);
    }

    //Update Student 
    public Student updateStudent(Student student){
        return StudentRespository.save(student);
    }

    //Delete Student
    public void deleteStudentById(int id){
        StudentRespository.deleteById(id);
        

    }

}
