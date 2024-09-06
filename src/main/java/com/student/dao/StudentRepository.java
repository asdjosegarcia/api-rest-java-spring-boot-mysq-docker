package com.student.dao;
<<<<<<< HEAD
//dao layer is the  responsible of interacting with the database. It abstracts and encapsulates all access to the data source and provides CRUD (Create, Read, Update, Delete) operations. 
=======
>>>>>>> f0b0e19 (first commit)

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.model.Student;

public interface StudentRepository extends JpaRepository<Student , Integer> {

}
