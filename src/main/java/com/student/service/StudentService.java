package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentRepository; //import from dao
import com.student.model.Student;

@Service //indicates that this class is a service layer in spring
//service layer
//contains the bussines logic of the application. it prosses data recived from the DAO layer and prepares it from the controler. It also handles other business-related tasks such as validation, computations, etc.
public class StudentService {
    @Autowired //
    StudentRepository StudentRepository;

    //Save student
    public Student saveStudent(Student student){
        return StudentRepository.save(student);
    };

    //Get all students
    public List <Student> getAllStudents(){
        return StudentRepository.findAll();
    };

    //Get Student by Id
    public Student getStudentById(int id){
        return StudentRepository.findById(id).orElse(null); //search the student if cand find him return null.
    };

    //Update student 
    public Student  updateStudent(Student student){
        return StudentRepository.save(student);
    }

    //Delete student
    public void deleteStudentById(int id){
        StudentRepository.deleteById(id);
    }

}
