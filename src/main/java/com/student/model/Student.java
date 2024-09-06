package com.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity//The framework will map the class to a database table, and each instance of the class will represent a row in the table.
public class Student {
<<<<<<< HEAD
     // Attributes  
     //can be accesed by outside the class
    @Id//The framework will treat this field as the unique identifier for the entity in the database.
    @GeneratedValue(strategy = GenerationType.AUTO) //Delegates the decision of witch generation strategy to the persistence provider
=======
     // Attributes
    @Id//The framework will treat this field as the unique identifier for the entity in the database.
    @GeneratedValue(strategy = GenerationType.AUTO) //
>>>>>>> f0b0e19 (first commit)
    private int id;
    private String name;
    private String fatherName;
    private String motherName;

    public Student() {
    }

    // Constructor
<<<<<<< HEAD
    //when create a object with the class, 
    public Student(int id, String name, String fatherName, String motherName) { //
=======
    public Student(int id, String name, String fatherName, String motherName) { //constructor with variables?
>>>>>>> f0b0e19 (first commit)
        this.id = id;
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //Geter
    public String getName() {
        return name;
    }
    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", motherName=" + motherName
                + "]";
    }

}
