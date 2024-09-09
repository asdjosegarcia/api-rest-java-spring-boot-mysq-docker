package com.student.dao;
//dao layer is the  responsible of interacting with the database. It abstracts and encapsulates all access to the data source and provides CRUD (Create, Read, Update, Delete) operations. 

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.model.Student;

public interface StudentRepository extends JpaRepository<Student , Integer> {

}
